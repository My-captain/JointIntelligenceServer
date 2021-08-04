(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-439f0934"],{"7aa7":function(t,e,r){"use strict";r.r(e);var a,n=function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("div",[r("Card",{on:{keydown:function(e){return!e.type.indexOf("key")&&t._k(e.keyCode,"enter",13,e.key,"Enter")?null:t.handleSubmit.apply(null,arguments)}}},[r("Row",[r("Col",{attrs:{span:"12"}},[r("p",{attrs:{slot:"title"},slot:"title"},[r("Icon",{attrs:{type:"log-in"}}),r("span",[t._v("新增目标")])],1)]),r("Col",{staticStyle:{"text-align":"right"},attrs:{span:"12"}},[r("Button",{staticStyle:{"margin-right":"10px"},attrs:{type:"success"},on:{click:t.handleSubmit}},[t._v("保存")]),r("Button",{attrs:{type:"primary"},on:{click:t.back}},[t._v("取消")])],1)],1),r("Row",[r("div",{staticClass:"form-con",staticStyle:{width:"100%"}},[r("Form",{ref:"form",staticStyle:{width:"90%","margin-left":"5%"},attrs:{model:t.form,rules:t.targetRules}},[r("Form-item",{attrs:{prop:"targetName",label:"目标名称"}},[r("Input",{attrs:{type:"text",placeholder:"请输入目标名称"},model:{value:t.form.targetName,callback:function(e){t.$set(t.form,"targetName",e)},expression:"form.targetName"}})],1),r("Form-item",{attrs:{prop:"properties",label:"目标类型"}},[r("Select",{model:{value:t.form.properties,callback:function(e){t.$set(t.form,"properties",e)},expression:"form.properties"}},t._l(t.propertyList,(function(e){return r("Option",{key:e.uuid,attrs:{value:e.uuid}},[t._v("\n                "+t._s(e.typeZh+"("+e.typeEn+")")+"\n              ")])})),1)],1),r("Form",{ref:"form.targetTraces",attrs:{model:t.form.targetTraces,"label-position":"left",rules:t.traceRules,inline:""}},[t._l(t.form.targetTraces,(function(e,a){return r("Row",{key:a,attrs:{label:"航迹"+e.index}},[r("Form-item",{staticStyle:{width:"100px"},attrs:{prop:"item.longitude",label:"航迹经度"}},[r("Input",{attrs:{number:"",type:"number",placeholder:"航迹经度"},model:{value:e.longitude,callback:function(r){t.$set(e,"longitude",r)},expression:"item.longitude"}})],1),r("Form-item",{staticStyle:{width:"100px"},attrs:{prop:"item.latitude",label:"航迹纬度"}},[r("InputNumber",{attrs:{type:"number",placeholder:"航迹纬度"},model:{value:e.latitude,callback:function(r){t.$set(e,"latitude",r)},expression:"item.latitude"}})],1),r("Form-item",{staticStyle:{width:"120px"},attrs:{prop:"item.altitude",label:"航迹海拔高度"}},[r("InputNumber",{attrs:{type:"number",placeholder:"航迹海拔高度"},model:{value:e.altitude,callback:function(r){t.$set(e,"altitude",r)},expression:"item.altitude"}})],1),r("Form-item",{staticStyle:{width:"120px"},attrs:{prop:"item.appearanceTime",label:"航迹点时刻"}},[r("DatePicker",{attrs:{type:"datetime",placeholder:"航迹点时刻"},model:{value:e.appearanceTime,callback:function(r){t.$set(e,"appearanceTime",r)},expression:"item.appearanceTime"}})],1),r("Form-item",[r("Button",{attrs:{type:"error"},on:{click:function(e){return t.handleRemove(a)}}},[t._v("删除")])],1)],1)})),r("FormItem",[r("Button",{attrs:{type:"dashed",long:"",icon:"md-add"},on:{click:t.handleAdd}},[t._v("添加航迹")])],1)],2)],1)],1)])],1)],1)},i=[],l=r("dc9e"),o=r("c276"),u={name:"militaryTarget_add",data:function(){return{form:{targetName:null,properties:null,targetTraceCnt:1,targetTraces:[{longitude:null,latitude:null,altitude:null,appearanceTime:null}]},targetRules:{properties:[{required:!0,message:"目标类型不能为空",trigger:"blur"}]},traceRules:{longitude:[{validator:o["m"],message:"经度不能为空",trigger:"blur"}],latitude:[{validator:o["m"],message:"纬度不能为空",trigger:"blur"}],altitude:[{validator:o["m"],message:"海拔高度不能为空",trigger:"blur"}],appearanceTime:[{required:!0,message:"航迹点时刻不能为空",trigger:"blur",type:"date"}]},propertyList:{}}},methods:{init:function(){var t=this;Object(l["e"])().then((function(e){Object(o["n"])(e)?(Object(o["y"])(a,"获取目标类型成功"),t.propertyList=e.data.data):Object(o["c"])(a,"获取数据失败:".concat(e.data.msg))})).catch((function(t){Object(o["w"])(t)}))},back:function(){this.$router.go(-1),this.closeTag({name:"militaryTarget_add"})},handleAdd:function(){a.targetTraceCnt++,a.form.targetTraces.push({longitude:null,latitude:null,altitude:null,appearanceTime:null})},handleRemove:function(t){a.form.targetTraces.splice(t,1)},handleSubmit:function(){var t=this;this.$refs["form"].validate((function(e){e&&t.$refs["form.targetTraces"].validate((function(e){e&&Object(l["b"])(a.form).then((function(e){Object(o["n"])(e)?(Object(o["y"])(a,"操作成功"),t.back()):Object(o["c"])(a,"操作失败")})).catch((function(t){Object(o["w"])(t)}))}))}))}},created:function(){a=this,this.init()}},c=u,s=r("2877"),d=Object(s["a"])(c,n,i,!1,null,"6282cca1",null);e["default"]=d.exports},dc9e:function(t,e,r){"use strict";r.d(e,"f",(function(){return n})),r.d(e,"b",(function(){return i})),r.d(e,"d",(function(){return l})),r.d(e,"h",(function(){return o})),r.d(e,"e",(function(){return u})),r.d(e,"a",(function(){return c})),r.d(e,"g",(function(){return s})),r.d(e,"c",(function(){return d}));var a=r("66df"),n=function(){return a["a"].request({url:"getAllTarget",method:"post"})},i=function(t){return a["a"].request({url:"addMilitaryTarget",method:"post",data:t})},l=function(t){return a["a"].request({url:"deleteMilitaryTarget",method:"post",data:{targetId:t}})},o=function(t){return a["a"].request({url:"updateMilitaryTarget",method:"post",data:t})},u=function(){return a["a"].request({url:"getAllMilitaryProperty",method:"post"})},c=function(t){return a["a"].request({url:"addMilitaryProperty",method:"post",data:t})},s=function(t){return a["a"].request({url:"updateMilitaryProperty",method:"post",data:t})},d=function(t){return a["a"].request({url:"deleteMilitaryProperty",method:"post",data:{uuid:t}})}}}]);