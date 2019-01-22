//
//  lodger.m
//  Archivefile
//
//  Created by Sharon on 2019/1/4.
//  Copyright © 2019年 Sharon. All rights reserved.
//

#import "lodger.h"

@implementation lodger
//反向传值
-(void)setFangdong:(landlord*)newFamgdong
{
    fangdong=newFamgdong;
}
//被委托者执行命令
-(void)house:(NSString*)message;
{
    NSLog(@"房东:%@",message);
}
-(landlord*)getFangdong
{
    return fangdong;
}
@end
