<template>
  <div>
    <Card @keydown.enter="handleSubmit">
      <Row>
        <Col span="12">
          <p slot="title">
            <Icon type="log-in"></Icon>
            <span>新增目标</span>
          </p>
        </Col>
        <Col span="12" style="text-align:right;">
          <Button @click="handleSubmit" type="success" style="margin-right:10px;">保存</Button>
          <Button @click="back" type="primary">取消</Button>
        </Col>
      </Row>
      <Row>
        <div class="form-con" style="width: 100%">
          <Form ref="form" :model="form" :rules="targetRules" style="width:90%;margin-left:5%;">
            <Form-item prop="targetName" label="目标名称">
              <Input type="text" v-model="form.targetName" placeholder="请输入目标名称"></Input>
            </Form-item>
            <Form-item prop="properties" label="目标类型">
              <Select v-model="form.properties">
                <Option v-for="item in propertyList" :value="item.uuid" :key="item.uuid">
                  {{ `${item.typeZh}(${item.typeEn})` }}
                </Option>
              </Select>
            </Form-item>

            <Form ref="form.targetTraces" :model="form.targetTraces" label-position="left" :rules="traceRules" inline>
              <Row v-for="(item, index) in form.targetTraces"
                   :key="index"
                   :label="'航迹' + item.index">
                <Form-item prop="item.longitude" label="航迹经度" style="width: 100px;">
                  <Input number type="number" v-model="item.longitude" placeholder="航迹经度"></Input>
                </Form-item>
                <Form-item prop="item.latitude" label="航迹纬度" style="width: 100px;">
                  <InputNumber type="number" v-model="item.latitude" placeholder="航迹纬度"></InputNumber>
                </Form-item>
                <Form-item prop="item.altitude" label="航迹海拔高度" style="width: 120px;">
                  <InputNumber type="number" v-model="item.altitude" placeholder="航迹海拔高度"></InputNumber>
                </Form-item>
                <Form-item prop="item.appearanceTime" label="航迹点时刻" style="width: 120px;">
                  <DatePicker v-model="item.appearanceTime" type="datetime" placeholder="航迹点时刻"></DatePicker>
                </Form-item>
                <Form-item>
                  <Button @click="handleRemove(index)" type="error">删除</Button>
                </Form-item>
              </Row>
              <FormItem>
                    <Button type="dashed" long @click="handleAdd" icon="md-add">添加航迹</Button>
              </FormItem>
            </Form>

          </Form>
        </div>
      </Row>
    </Card>
  </div>
</template>

<script>

import { addTarget, getAllProperty } from '../../api/militaryTarget'
import { errMsg, isSuccess, showError, successMsg, inputNumberValidator } from '../../libs/util'

let vm
export default {
  name: 'militaryTarget_add',
  data () {
    return {
      form: {
        targetName: null,
        properties: null,
        targetTraceCnt: 1,
        targetTraces: [
          {
            longitude: null,
            latitude: null,
            altitude: null,
            appearanceTime: null
          }
        ]
      },
      targetRules: {
        properties: [{ required: true, message: '目标类型不能为空', trigger: 'blur' }]
      },
      traceRules: {
        longitude: [{ validator: inputNumberValidator, message: '经度不能为空', trigger: 'blur' }],
        latitude: [{ validator: inputNumberValidator, message: '纬度不能为空', trigger: 'blur' }],
        altitude: [{ validator: inputNumberValidator, message: '海拔高度不能为空', trigger: 'blur' }],
        appearanceTime: [{ required: true, message: '航迹点时刻不能为空', trigger: 'blur', type: 'date' }]
      },
      propertyList: {}
    }
  },
  methods: {
    init () {
      getAllProperty().then(result => {
        if (isSuccess(result)) {
          successMsg(vm, `获取目标类型成功`)
          this.propertyList = result.data.data
        } else {
          errMsg(vm, `获取数据失败:${result.data.msg}`)
        }
      }).catch(error => {
        showError(error)
      })
    },
    back () {
      this.$router.go(-1)
      this.closeTag({
        name: 'militaryTarget_add'
      })
    },
    handleAdd () {
      vm.targetTraceCnt++
      vm.form.targetTraces.push({
        longitude: null,
        latitude: null,
        altitude: null,
        appearanceTime: null
      })
    },
    handleRemove (index) {
      vm.form.targetTraces.splice(index, 1)
    },
    handleSubmit () {
      this.$refs['form'].validate((valid) => {
        if (valid) {
          this.$refs['form.targetTraces'].validate((valid) => {
            if (valid) {
              addTarget(vm.form).then(result => {
                if (isSuccess(result)) {
                  successMsg(vm, '操作成功')
                  this.back()
                } else {
                  errMsg(vm, '操作失败')
                }
              }).catch(err => {
                showError(err)
              })
            }
          })
        }
      })
    }
  },
  created () {
    vm = this
    this.init()
  }
}
</script>

<style scoped>

</style>
