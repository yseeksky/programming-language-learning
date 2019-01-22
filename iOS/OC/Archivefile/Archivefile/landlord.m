//
//  landlord.m
//  Archivefile
//
//  Created by Sharon on 2019/1/4.
//  Copyright © 2019年 Sharon. All rights reserved.
//

#import "landlord.h"

@implementation landlord
-(void)setDetegate:(id)newDetegate
{
    detegate=newDetegate;
}
-(void)talk
{
    //委托者向被委托者传值，即正向传值
    [detegate house:@"每个月 18 号交房租!"];
}
-(void)sendMessageToFangdong:(NSString*)message
{
    NSLog(@"fangkeshuo:%@",message);
}
@end
