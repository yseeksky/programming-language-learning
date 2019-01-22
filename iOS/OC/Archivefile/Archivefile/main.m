//
//  main.m
//  Archivefile
//
//  Created by Sharon on 2019/1/4.
//  Copyright © 2019年 Sharon. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "lodger.h"
#import "landlord.h"
int main(int argc, const char * argv[]) {
    @autoreleasepool {
        // insert code here...
        NSLog(@"Hello, World!");
        landlord* land=[[landlord alloc]init];
        lodger* lod=[[lodger alloc]init];
        [land setDetegate:lod];
        [land talk];
        //反向传值:被委托者向委托者传值就是反向传值，反向传值第一步被委托者必须得保留委托者的指针，第二步委托者要提供一个方法让被委托者去传递消息，第三步用被委托者所保留的委托者的指针去调用委托者传递的消息就可以了
        [lod setFangdong:land];
        [[lod getFangdong]sendMessageToFangdong:@"房租已经交了"];
//        在于回调，异步处理
        
    }
    return 0;
}
