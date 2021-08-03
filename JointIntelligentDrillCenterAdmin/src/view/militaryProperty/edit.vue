<template>
  <div>
    <Card @keydown.enter="handleSubmit">
      <Row>
        <Col span="12">
          <Icon type="log-in"></Icon>
          <span>编辑目标型号</span>
        </Col>
        <Col span="12" style="text-align:right;">
          <Button @click="handleSubmit" type="success" style="margin-right:10px;">保存</Button>
          <Button @click="back" type="primary">取消</Button>
        </Col>
      </Row>
      <Row>
        <div class="form-con" style="width: 100%">
          <Form ref="addPropertyForm" :model="form" :rules="rules" style="width:70%;margin-left:16%;">
            <Form-item prop="uuid" hidden="hidden" label="UUID">
              <Input disabled type="text" v-model="form.uuid"/>
            </Form-item>
            <Form-item prop="typeZh" label="目标型号(中文)">
              <Input type="text" v-model="form.typeZh" placeholder="请输入目标型号(中文)"></Input>
            </Form-item>
            <Form-item prop="typeEn" label="目标型号(英文)">
              <Input type="text" v-model="form.typeEn" placeholder="请输入目标型号(英文)"></Input>
            </Form-item>
            <Form-item prop="category" label="目标类型">
              <Select v-model="form.category">
                <Option v-for="item in targetCategoryList" :value="item.val" :key="item.val">{{ item.label }}</Option>
              </Select>
            </Form-item>
            <Form-item prop="maxSpeed" label="最大速度">
              <InputNumber style="width: 100%" v-model="form.maxSpeed" placeholder="请输入目标的最大速度"></InputNumber>
            </Form-item>
            <Form-item prop="attackRadius" label="攻击半径">
              <InputNumber style="width: 100%" v-model="form.attackRadius" placeholder="请输入目标的攻击半径"></InputNumber>
            </Form-item>
            <Form-item prop="detectionRadius" label="侦察半径">
              <InputNumber style="width: 100%" v-model="form.detectionRadius" placeholder="请输入目标的侦察半径"></InputNumber>
            </Form-item>
          </Form>
        </div>
      </Row>
    </Card>
  </div>
</template>

<script>
import { updateProperty } from '../../api/militaryTarget'
import { errMsg, isSuccess, showError, successMsg } from '../../libs/util'

let vm
export default {
  name: 'militaryProperty_edit',
  data () {
    return {
      form: {
        uuid: null,
        typeZh: null,
        typeEn: null,
        category: null,
        maxSpeed: null,
        attackRadius: null,
        detectionRadius: null
      },
      rules: {
        typeZh: [{ required: true, message: '名称不能为空', trigger: 'blur' }],
        typeEn: [{ required: true, message: '名称不能为空', trigger: 'blur' }],
        category: [{ required: true, message: '目标类型不能为空', trigger: 'blur', type: 'number' }],
        maxSpeed: [{ required: true, message: '最大速度不能为空', trigger: 'blur', type: 'number' }],
        attackRadius: [{ required: true, message: '攻击半径不能为空', trigger: 'blur', type: 'number' }],
        detectionRadius: [{ required: true, message: '侦察半径不能为空', trigger: 'blur', type: 'number' }]
      },
      targetCategoryList: []
    }
  },
  methods: {
    init () {
      vm.targetCategoryList = vm.$config.targetCategory
      let param = vm.$route.query
      vm.form.uuid = param.uuid
      vm.form.typeZh = param.typeZh
      vm.form.typeEn = param.typeEn
      vm.form.maxSpeed = parseFloat(param.maxSpeed)
      vm.form.attackRadius = parseFloat(param.attackRadius)
      vm.form.detectionRadius = parseFloat(param.detectionRadius)
      vm.form.category = parseInt(param.category)
    },
    back () {
      this.$router.go(-1)
      this.closeTag({
        name: 'militaryProperty_edit'
      })
    },
    handleSubmit () {
      this.$refs.addPropertyForm.validate(valid => {
        if (valid) {
          updateProperty({
            uuid: vm.form.uuid,
            typeZh: vm.form.typeZh,
            typeEn: vm.form.typeEn,
            category: vm.form.category,
            maxSpeed: vm.form.maxSpeed,
            attackRadius: vm.form.attackRadius,
            detectionRadius: vm.form.detectionRadius
          }).then(res => {
            if (isSuccess(res)) {
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
  },
  created () {
    vm = this
    this.init()
  }
}
</script>

<style scoped>

</style>
