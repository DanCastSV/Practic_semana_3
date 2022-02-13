package com.example.practic_semana_3

fun main(){
    var caso1 = generarArreglo(0)
    var data1 = ArrayList<ArrayList<Int>>()
    var element = ArrayList<Int>()
    element.add(0)
    data1.add(element)
    println("Test1 passed ${caso1 == data1}")
}
fun generarArreglo(n:Int):ArrayList<ArrayList<Int>>{
    var data = ArrayList<ArrayList<Int>>()
    if(n==0){
        var element = ArrayList<Int>()
        element.add(0)
        data.add(element)
        return data
    }
    for(i in 0 until n){
        var element = ArrayList<Int>()
        for(i in 0 until n){
            element.add(n)
        }
        data.add(element)
    }
    var element = ArrayList<Int>()
    element.add(n*n*n)
    data.add(element)
    return data
}