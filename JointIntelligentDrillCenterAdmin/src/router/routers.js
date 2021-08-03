import Main from '@/components/main'
import parentView from '@/components/parent-view'

export default [
  {
    path: '/login',
    name: 'login',
    meta: {
      title: 'Login - 登录',
      hideInMenu: true
    },
    component: () => import('@/view/login/login.vue')
  },
  {
    path: 'military_target',
    name: 'military_target',
    meta: {
      title: '军事目标管理',
      icon: 'ios-jet-outline'
    },
    component: Main,
    children: [
      {
        path: '/militaryTarget/index',
        name: 'militaryTarget_index',
        meta: {
          icon: 'ios-jet-outline',
          title: '军事目标管理'
        },
        component: () => import('@/view/militaryTarget/index.vue')
      }, {
        path: '/militaryTarget/add',
        name: 'militaryTarget_add',
        meta: {
          icon: 'ios-jet-outline',
          title: '添加目标'
        },
        component: () => import('@/view/militaryTarget/add.vue')
      }, {
        path: '/militaryTarget/edit',
        name: 'militaryTarget_edit',
        meta: {
          icon: 'ios-jet-outline',
          title: '添加目标类型',
          hideInMenu: true,
          notCache: true
        },
        component: () => import('@/view/militaryTarget/edit.vue')
      }
    ]
  },
  {
    path: 'military_property',
    name: 'military_property',
    meta: {
      title: '目标类型管理',
      icon: 'ios-jet-outline'
    },
    component: Main,
    children: [
      {
        path: '/militaryProperty/index',
        name: 'militaryProperty_index',
        meta: {
          icon: 'ios-jet-outline',
          title: '目标类型管理'
        },
        component: () => import('@/view/militaryProperty/index.vue')
      }, {
        path: '/militaryProperty/add',
        name: 'militaryProperty_add',
        meta: {
          icon: 'ios-jet-outline',
          title: '添加目标类型'
        },
        component: () => import('@/view/militaryProperty/add.vue')
      }, {
        path: '/militaryProperty/edit',
        name: 'militaryProperty_edit',
        meta: {
          icon: 'ios-jet-outline',
          title: '添加目标类型',
          hideInMenu: true,
          notCache: true
        },
        component: () => import('@/view/militaryProperty/edit.vue')
      }
    ]
  },
  {
    path: '/',
    name: '_home',
    redirect: '/home',
    component: Main,
    meta: {
      hideInMenu: true,
      notCache: true
    },
    children: [
      {
        path: '/home',
        name: 'home',
        meta: {
          hideInMenu: true,
          title: '首页',
          notCache: true,
          icon: 'md-home'
        },
        component: () => import('@/view/single-page/home')
      }
    ]
  },
  {
    path: '/401',
    name: 'error_401',
    meta: {
      hideInMenu: true
    },
    component: () => import('@/view/error-page/401.vue')
  },
  {
    path: '/500',
    name: 'error_500',
    meta: {
      hideInMenu: true
    },
    component: () => import('@/view/error-page/500.vue')
  },
  {
    path: '*',
    name: 'error_404',
    meta: {
      hideInMenu: true
    },
    component: () => import('@/view/error-page/404.vue')
  }
]
