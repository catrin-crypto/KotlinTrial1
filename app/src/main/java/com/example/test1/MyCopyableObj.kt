package com.example.test1

 object MyCopyableObj : DataProps {
     override  var name = "str"
     override  var age = 7
     fun copy(): DataProps {
         return object : DataProps{
             override var name = MyCopyableObj.name
             override  var age = MyCopyableObj.age
         }
     }
}