//
//  landlord.h
//  Archivefile
//
//  Created by Sharon on 2019/1/4.
//  Copyright © 2019年 Sharon. All rights reserved.
//

#import <Foundation/Foundation.h>

@protocol RentProtocol <NSObject>

//协议中定义的两个方法，被委托者使用时可以声明，也可以不声明
//@required修饰的协议方法是必须实现的，系统默认是@required修饰
@required
//正向传值
-(void)house:(NSString*)message;
//@optional修饰的协议方法法是选择性实现的，可以实现，也可以不实现
@optional
-(void)fangzi;
@end

NS_ASSUME_NONNULL_BEGIN

@interface landlord : NSObject
{
    //定义一个遵循协议的被委托者的成员变量
    id<RentProtocol>detegate;
}
//设置被委托者的成员变量，就是被委托者的类型
-(void)setDetegate:(id)newDetegate;
//委托者的命令
-(void)talk;
//接收被委托者反向传过来的值
-(void)sendMessageToFangdong:(NSString*)message;


@end

NS_ASSUME_NONNULL_END
