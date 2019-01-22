//
//  main.swift
//  Structure
//
//  Created by Sharon on 2019/1/4.
//  Copyright © 2019年 Sharon. All rights reserved.
//

import Foundation

print("Hello, World!")
class SomeClass {
    // 在这里定义类
}
struct SomeStructure {
    // 在这里定义结构体
}


struct Resolution {
    var width = 0
    var height = 0
}
class VideoMode {
    var resolution = Resolution()
    var interlaced = false
    var frameRate = 0.0
    var name: String?
}

//生成结构体和类实例
let someResolution = Resolution()
let someVideoMode = VideoMode()
/*
 结构体和类都使用构造器语法来生成新的实例。构造器语法的最简单形式是在结构体或者类的类型名称后跟随一对空括号，如 Resolution() 或 VideoMode()。通过这种方式所创建的类或者结构体实例，其属性均会被初始化为默认值。
 */



//通过使用点语法，你可以访问实例的属性
print("The width of someResolution is \(someResolution.width)")

//也可以访问子属性，如 VideoMode 中 Resolution 属性的 width 属性
print("The width of someVideoMode is \(someVideoMode.resolution.width)")

//可以使用点语法为变量属性赋值
someVideoMode.resolution.width = 1280
print("The width of someVideoMode is now \(someVideoMode.resolution.width)")

let vga = Resolution(width: 640, height: 480)

let hd = Resolution(width: 1920, height: 1080)
var cinema = hd

/*
 在以上示例中，声明了一个名为 hd 的常量，其值为一个初始化为全高清视频分辨率（1920 像素宽，1080 像素高）的 Resolution 实例。
 
 然后示例中又声明了一个名为 cinema 的变量，并将 hd 赋值给它。因为 Resolution 是一个结构体，所以 cinema 的值其实是 hd 的一个拷贝副本，而不是 hd 本身。尽管 hd 和 cinema 有着相同的宽（width）和高（height），但是在幕后它们是两个完全不同的实例。
 */
cinema.width = 2048
print("cinema is now  \(cinema.width) pixels wide")
// 打印 "cinema is now 2048 pixels wide"
print("hd is still \(hd.width) pixels wide")
// 打印 "hd is still 1920 pixels wide"

let tenEighty = VideoMode()
tenEighty.resolution = hd
tenEighty.interlaced = true
tenEighty.name = "1080i"
tenEighty.frameRate = 25.0
/*
 以上示例中，声明了一个名为 tenEighty 的常量，其引用了一个 VideoMode 类的新实例。在之前的示例中，这个视频模式（video mode）被赋予了 HD 分辨率（1920*1080）的一个拷贝（即 hd 实例）。同时设置为 interlaced，命名为 “1080i”。最后，其帧率是 25.0 帧每秒。
 
 然后，tenEighty 被赋予名为 alsoTenEighty 的新常量，同时对 alsoTenEighty 的帧率进行修改
 */
let alsoTenEighty = tenEighty
alsoTenEighty.frameRate = 30.0

/*
 因为类是引用类型，所以 tenEight 和 alsoTenEight 实际上引用的是相同的 VideoMode 实例。换句话说，它们是同一个实例的两种叫法。
 
 下面，通过查看 tenEighty 的 frameRate 属性，我们会发现它正确的显示了所引用的 VideoMode 实例的新帧率，其值为 30.0：
 */
print("The frameRate property of tenEighty is now \(tenEighty.frameRate)")

