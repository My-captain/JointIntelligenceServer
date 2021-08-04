<template>
  <Card class="login-card">
    <p style="text-align: center;font-size: 80px;color: white">联合情报目标管理</p>
    <p style="text-align: center;">
      <Button type="primary" to="/militaryTarget/index">前往管理军事目标</Button>
    </p>
  </Card>
</template>

<script>
import InforCard from '_c/info-card'
import CountTo from '_c/count-to'
import { ChartPie, ChartBar } from '_c/charts'
import Example from './example.vue'
import homeBackground from '@/assets/images/home-background.png'

export default {
  name: 'home',
  components: {
    InforCard,
    CountTo,
    ChartPie,
    ChartBar,
    Example
  },
  data () {
    return {
      homeBackground
    }
  },
  mounted () {
    //
  }
}
</script>

<style lang="less">
.login-card {
  width: 100%;
  height: 100%;
  background-image:url('../../../assets/images/home-background.png');
  background-repeat: no-repeat;
  background-position: right;
  background-size: cover;
}
</style>
