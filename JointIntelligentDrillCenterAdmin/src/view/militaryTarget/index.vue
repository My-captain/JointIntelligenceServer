<template>

  <div>
    <Card>
      <Row>
        <Col span="4">
          <Button type="primary" @click="add" style="margin-left:10px;">添加目标</Button>
          <Button type="success" @click="refresh" style="margin-left:18px;">刷新</Button>
        </Col>
      </Row>
    </Card>
    <Card  style="margin-top:1%;">
      <Table border :columns="columns" :data="tableData"></Table>
    </Card>
  </div>

</template>

<script>
import { deleteTarget, getAllTarget } from '../../api/militaryTarget'
import { successMsg, errMsg, isSuccess, showError, changePage } from '../../libs/util'

let vm
export default {
  name: 'militaryTarget_index',
  data () {
    return {
      columns: [
        {
          title: '目标名称',
          key: 'targetName',
          width: 100,
          align: 'center',
          fixed: 'left'
        }, {
          title: '型号(中文)',
          align: 'center',
          render: (h, params) => {
            return h('Span', params.row.militaryProperty.typeZh)
          }
        }, {
          title: '型号(英文)',
          align: 'center',
          render: (h, params) => {
            return h('Span', params.row.militaryProperty.typeEn)
          }
        }, {
          title: '目标类型',
          align: 'center',
          render: (h, params) => {
            return h('Span', params.row.militaryProperty.category)
          }
        }, {
          title: '最大速度',
          align: 'center',
          render: (h, params) => {
            return h('Span', params.row.militaryProperty.maxSpeed)
          }
        }, {
          title: '攻击半径',
          align: 'center',
          render: (h, params) => {
            return h('Span', params.row.militaryProperty.attackRadius)
          }
        }, {
          title: '侦察半径',
          align: 'center',
          render: (h, params) => {
            return h('Span', params.row.militaryProperty.detectionRadius)
          }
        },
        {
          title: '操作',
          fixed: 'right',
          align: 'center',
          width: 160,
          render: (h, params) => {
            return h('div', [
              h('Button', {
                props: {
                  type: 'primary',
                  size: 'small'
                },
                on: {
                  click: () => {
                    changePage(this, 'militaryTarget_edit', params.row)
                  }
                }
              }, '编辑'),
              h('Button', {
                props: {
                  type: 'error',
                  size: 'small'
                },
                style: {
                  marginLeft: '5px'
                },
                on: {
                  click: () => {
                    vm.handleDeleteTarget(params.row.uuid)
                  }
                }
              }, '删除')
            ])
          }
        }
      ],
      tableData: []
    }
  },
  methods: {
    add () {
      changePage(this, 'militaryTarget_add')
    },
    refresh () {
      this.query()
    },
    handleDeleteTarget (targetId) {
      deleteTarget(targetId).then(result => {
        if (isSuccess(result)) {
          successMsg(vm, `操作成功`)
          vm.refresh()
        } else {
          errMsg(vm, `操作失败:${result.data.msg}`)
        }
      }).catch(error => {
        showError(error)
      })
    },
    query () {
      getAllTarget().then(result => {
        if (isSuccess(result)) {
          successMsg(vm, `获取数据成功`)
          this.tableData = result.data.data
        } else {
          errMsg(vm, `获取数据失败:${result.data.msg}`)
        }
      }).catch(error => {
        showError(error)
      })
    }
  },
  watch: {},
  mounted () {
    vm = this
    this.query()
  },
  created () {
  }
}
</script>

<style scoped>

</style>
