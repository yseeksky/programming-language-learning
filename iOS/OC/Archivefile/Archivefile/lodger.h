//
//  lodger.h
//  Archivefile
//
//  Created by Sharon on 2019/1/4.
//  Copyright © 2019年 Sharon. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "landlord.h"
NS_ASSUME_NONNULL_BEGIN

@interface lodger : NSObject<RentProtocol>
{
    //反向传值，被委托者里声明委托者的成员变量，保留委托者的指针
    landlord* fangdong;
}
-(void)setFangdong:(landlord*)newFamgdong;
-(landlord*)getFangdong;
@end

NS_ASSUME_NONNULL_END
