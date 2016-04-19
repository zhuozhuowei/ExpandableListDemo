package com.example.aa;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * @version V1.0
 * @ClassName:
 * @Description:
 * @Author：xiaofa
 * @Date：2016/4/14 14:28
 */
public class LcBean implements Serializable{

    private static final long serialVersionUID = 1L;
    /**
     * status : 200
     * info : success
     * data : {"id":"34","title":"尘世之外－寻找心灵的迦南地","sub_title":"整座山里，犹如世外桃源般的地方，让身体和心灵一起行修","addr":"日本关西地区","tel":"400-6076-808","head_pic":"http://img2.handybest.com/Uploads/topic/20160128/14539668925993.jpg!phone","t_sort":"50","create_time":"1453967021","t_status":"1","start_time":"2016-01-28","end_time":"2017-08-26","t_type":"1","goods_id":"","small_title":"3380元／人起","size_pic":{"0":501,"1":332,"2":2,"3":"width=\"501\" height=\"332\"","bits":8,"channels":3,"mime":"image/jpeg"},"details":[{"id":"97","tid":"34","create_time":"1453967076","last_update":"1453967992","t_sort":"30","t_status":"1","tag_title":"遇见一片桃源","pict":[{"id":"257","tid":"34","did":"97","pic_url":"http://img2.handybest.com/Uploads/topic/34/14539671192656.jpg!phone","content":"在古老的奈良，有这样一座坐落在半山的世外桃源般的地方，它是圣德太子在天王庇佑取得战争胜利后创建伽蓝之地。七福神之一的毘沙门天，作为生意兴隆和家人平安之神受到人们的信仰，便供奉在这座寺庙里。在这里可以体验行修，坐禅，抄经，祈福，真正感受一次日本僧侣的生活，让身体和灵魂进行一次完美的结合。","create_time":"0","p_sort":"5","last_update":"0","t_status":"1","pic_size":{"0":651,"1":391,"2":2,"3":"width=\"651\" height=\"391\"","bits":8,"channels":3,"mime":"image/jpeg"}}]},{"id":"98","tid":"34","create_time":"1453967159","last_update":"1453969852","t_sort":"28","t_status":"1","tag_title":"寻找一片心灵迦南地","pict":[{"id":"258","tid":"34","did":"98","pic_url":"http://img3.handybest.com/Uploads/topic/34/14539671969898.jpg!phone","content":"因偶然而遇见这座占据整座山的寺庙，很少为中国游客所知，来这里行修的大多数为当地人和一些欧洲信奉佛教的虔心之客。\r\n\r\n整整一座山，美到让人窒息，寺庙执事应允可对部分有信仰的中国客户开放，在这座清静绝美之地，来一次身心灵的涤荡。","create_time":"0","p_sort":"5","last_update":"0","t_status":"1","pic_size":{"0":800,"1":493,"2":2,"3":"width=\"800\" height=\"493\"","bits":8,"channels":3,"mime":"image/jpeg"}}]},{"id":"99","tid":"34","create_time":"1453967234","last_update":"1454471562","t_sort":"27","t_status":"1","tag_title":"二日禅修之旅安排","pict":[{"id":"259","tid":"34","did":"99","pic_url":"http://img1.handybest.com/Uploads/topic/34/14539672602555.jpg!phone","content":"第一天：\r\n管家前往酒店接到客人后前往信贵山，在寺庙办理入住，后自由观光或由管家辅助了解寺院可执行行修项目，参与行修。\r\n\r\n第二天：\r\n行修祈祷的一天，下午离开可前往周边观光","create_time":"0","p_sort":"30","last_update":"0","t_status":"1","pic_size":{"0":800,"1":450,"2":2,"3":"width=\"800\" height=\"450\"","bits":8,"channels":3,"mime":"image/jpeg"}},{"id":"260","tid":"34","did":"99","pic_url":"http://img3.handybest.com/Uploads/topic/34/14539673011084.jpg!phone","content":"【关于禅修与祈祷】\r\n\r\n听取座禅的指导与祈福（如需法衣可租用，参考价格：2000日元／天）\r\n\r\n【专业禅修参考】\r\n\r\n9:00～ 9:55\t法話\r\n10:00～10:30\t百八礼拝\r\n10:30～11:10\t阿息観\r\n11:15～12:15\t大般若祈祷・戒壇めぐり諸堂参拝\r\n12:30～13:00\t食事作法と食事\r\n13:15～14:05\t般若心経と食事作法解説\r\n14:15～16:00\t心経読経と写経","create_time":"0","p_sort":"28","last_update":"0","t_status":"1","pic_size":{"0":415,"1":202,"2":2,"3":"width=\"415\" height=\"202\"","bits":8,"channels":3,"mime":"image/jpeg"}},{"id":"261","tid":"34","did":"99","pic_url":"http://img2.handybest.com/Uploads/topic/34/14539673424303.jpg!phone","content":"【祈祷流程】\r\n\r\n1.在本堂（正殿）、塔頭（寺内的小寺）或者宿坊（所住客室）内填写申请表。\r\n受理时间：\r\n本堂（正殿）\t9時～16時\t\r\n塔頭（寺内的小寺）或者宿坊（所住客室）\t随時\t\r\n2.申请后，进入本堂（正殿）内等候。\r\n3.跟着执行法事的僧侣认真地进行祈祷。\r\n4.直到祈祷结束都要安静地在内阵之内，祈祷的过程中参拜毗沙门天王和二十八使者像。\r\n5.祈祷完成之后赐予写有姓名的纸签或木牌。\r\n\r\n备注：寺庙中不同祈祷所需料金不同，可根据现场希望祈愿的内容直接向寺院支付料金\r\n","create_time":"0","p_sort":"26","last_update":"0","t_status":"1","pic_size":{"0":800,"1":585,"2":2,"3":"width=\"800\" height=\"585\"","bits":8,"channels":3,"mime":"image/jpeg"}}]},{"id":"100","tid":"34","create_time":"1453967389","last_update":"1454471565","t_sort":"25","t_status":"1","tag_title":"关于宿泊","pict":[{"id":"263","tid":"34","did":"100","pic_url":"http://img2.handybest.com/Uploads/topic/34/145396740528.jpg!phone","content":"宿泊安排在朴素典雅的日式斋房，2-4人一间","create_time":"0","p_sort":"5","last_update":"0","t_status":"1","pic_size":{"0":415,"1":266,"2":2,"3":"width=\"415\" height=\"266\"","bits":8,"channels":3,"mime":"image/jpeg"}}]},{"id":"101","tid":"34","create_time":"1453967458","last_update":"1453967986","t_sort":"24","t_status":"1","tag_title":"关于餐食","pict":[{"id":"264","tid":"34","did":"101","pic_url":"http://img2.handybest.com/Uploads/topic/34/14539674685323.jpg!phone","content":"餐食安排为精进或会席料理，套餐中已包含","create_time":"0","p_sort":"5","last_update":"0","t_status":"1","pic_size":{"0":314,"1":111,"2":2,"3":"width=\"314\" height=\"111\"","bits":8,"channels":3,"mime":"image/jpeg"}}]},{"id":"102","tid":"34","create_time":"1453967540","last_update":"1453967984","t_sort":"22","t_status":"1","tag_title":"寺庙平面图及环境","pict":[{"id":"265","tid":"34","did":"102","pic_url":"http://img2.handybest.com/Uploads/topic/34/14539675525182.jpg!phone","content":"","create_time":"0","p_sort":"8","last_update":"0","t_status":"1","pic_size":{"0":415,"1":292,"2":2,"3":"width=\"415\" height=\"292\"","bits":8,"channels":3,"mime":"image/jpeg"}},{"id":"266","tid":"34","did":"102","pic_url":"http://img3.handybest.com/Uploads/topic/34/14539675719118.jpg!phone","content":"","create_time":"0","p_sort":"7","last_update":"0","t_status":"1","pic_size":{"0":800,"1":452,"2":2,"3":"width=\"800\" height=\"452\"","bits":8,"channels":3,"mime":"image/jpeg"}},{"id":"267","tid":"34","did":"102","pic_url":"http://img1.handybest.com/Uploads/topic/34/14539675875081.jpg!phone","content":"","create_time":"0","p_sort":"6","last_update":"0","t_status":"1","pic_size":{"0":415,"1":269,"2":2,"3":"width=\"415\" height=\"269\"","bits":8,"channels":3,"mime":"image/jpeg"}},{"id":"268","tid":"34","did":"102","pic_url":"http://img3.handybest.com/Uploads/topic/34/14539676013386.jpg!phone","content":"","create_time":"0","p_sort":"5","last_update":"0","t_status":"1","pic_size":{"0":415,"1":268,"2":2,"3":"width=\"415\" height=\"268\"","bits":8,"channels":3,"mime":"image/jpeg"}},{"id":"269","tid":"34","did":"102","pic_url":"http://img2.handybest.com/Uploads/topic/34/1453967620985.jpg!phone","content":"","create_time":"0","p_sort":"4","last_update":"0","t_status":"1","pic_size":{"0":415,"1":277,"2":2,"3":"width=\"415\" height=\"277\"","bits":8,"channels":3,"mime":"image/jpeg"}},{"id":"270","tid":"34","did":"102","pic_url":"http://img1.handybest.com/Uploads/topic/34/1453967634462.jpg!phone","content":"","create_time":"0","p_sort":"3","last_update":"0","t_status":"1","pic_size":{"0":640,"1":452,"2":2,"3":"width=\"640\" height=\"452\"","bits":8,"channels":3,"mime":"image/jpeg"}}]},{"id":"103","tid":"34","create_time":"1453967659","last_update":"1453967982","t_sort":"21","t_status":"1","tag_title":"预订说明","pict":[{"id":"271","tid":"34","did":"103","pic_url":false,"content":"【预订说明】\r\n1.此产品如需订购请至少提前一周以上；\r\n2.行修产品由于寺庙语言沟通问题及行修日程执行环节需提示，全程匹配中文小一管家进行翻译与陪同；\r\n3.寺庙行修与酒店不同，雅致的环境中只有僧人做简单服务，请勿与酒店服务做比较。公共风吕浴池，斋房无上锁，请务必遵守行修日程时间规定，不要产生不守时等现象。\r\n4.此产品费用根据人数不同有浮动：\r\n3380元／人（4人团）\r\n3980元／人（3人团）\r\n5380元／人（2人团）\r\n其他人数请电话咨询\r\n5.此产品不接受单人预订，产品价格为4人团的单人预订价格，请购买4次。如2人团购买请联系客服改价。","create_time":"0","p_sort":"5","last_update":"0","t_status":"1","pic_size":false}]},{"id":"104","tid":"34","create_time":"1453967843","last_update":"1453967981","t_sort":"20","t_status":"1","tag_title":"费用说明","pict":[{"id":"272","tid":"34","did":"104","pic_url":"http://img3.handybest.com/Uploads/topic/34/14539679088995.jpg!phone","content":"【费用包含】\r\n1.2日高端商务车阿尔法用车（7-8座）全天用车费\r\n（酒店接送至寺庙，返回，或多余时间的市区观光均含，每天10小时300公里。如超公里，10公里2000日元；超时，每小时5000日元，此部分可现付管家）\r\n2.管家全程服务费及翻译费（含一晚管家附近住宿）\r\n3.寺庙住宿及早晚餐费用（第一天晚餐与第二天早餐） 2-4人均住一间房\r\n\r\n费用不包含：\r\n寺庙中祈祷等其他个人参与事项的花费","create_time":"0","p_sort":"5","last_update":"0","t_status":"1","pic_size":{"0":800,"1":534,"2":2,"3":"width=\"800\" height=\"534\"","bits":8,"channels":3,"mime":"image/jpeg"}}]},{"id":"105","tid":"34","create_time":"1453967930","last_update":"1453967979","t_sort":"18","t_status":"1","tag_title":"取消政策","pict":[{"id":"273","tid":"34","did":"105","pic_url":"http://img2.handybest.com/Uploads/topic/34/1453967970285.jpg!phone","content":"1.我们会尽可能按照行程中合作机构规定进行沟通协调，根据实际情况进行退款；\r\n2.预定后出发前30天以上取消退全款90%，15天以上30天以内取消退全款40%，15天及以内不予退款。\r\n3.第二点退款政策基于第一点实际情况（如涉及到提前预定的酒店或预付款项目时），当无法包含第一点时，按照第一点实际情况＋第二点政策执行退款。\r\n","create_time":"0","p_sort":"5","last_update":"0","t_status":"1","pic_size":{"0":800,"1":485,"2":2,"3":"width=\"800\" height=\"485\"","bits":8,"channels":3,"mime":"image/jpeg"}}]}]}
     */

    private int id;
    private int status;
    private String info;
    /**
     * id : 34
     * title : 尘世之外－寻找心灵的迦南地
     * sub_title : 整座山里，犹如世外桃源般的地方，让身体和心灵一起行修
     * addr : 日本关西地区
     * tel : 400-6076-808
     * head_pic : http://img2.handybest.com/Uploads/topic/20160128/14539668925993.jpg!phone
     * t_sort : 50
     * create_time : 1453967021
     * t_status : 1
     * start_time : 2016-01-28
     * end_time : 2017-08-26
     * t_type : 1
     * goods_id :
     * small_title : 3380元／人起
     * size_pic : {"0":501,"1":332,"2":2,"3":"width=\"501\" height=\"332\"","bits":8,"channels":3,"mime":"image/jpeg"}
     * details : [{"id":"97","tid":"34","create_time":"1453967076","last_update":"1453967992","t_sort":"30","t_status":"1","tag_title":"遇见一片桃源","pict":[{"id":"257","tid":"34","did":"97","pic_url":"http://img2.handybest.com/Uploads/topic/34/14539671192656.jpg!phone","content":"在古老的奈良，有这样一座坐落在半山的世外桃源般的地方，它是圣德太子在天王庇佑取得战争胜利后创建伽蓝之地。七福神之一的毘沙门天，作为生意兴隆和家人平安之神受到人们的信仰，便供奉在这座寺庙里。在这里可以体验行修，坐禅，抄经，祈福，真正感受一次日本僧侣的生活，让身体和灵魂进行一次完美的结合。","create_time":"0","p_sort":"5","last_update":"0","t_status":"1","pic_size":{"0":651,"1":391,"2":2,"3":"width=\"651\" height=\"391\"","bits":8,"channels":3,"mime":"image/jpeg"}}]},{"id":"98","tid":"34","create_time":"1453967159","last_update":"1453969852","t_sort":"28","t_status":"1","tag_title":"寻找一片心灵迦南地","pict":[{"id":"258","tid":"34","did":"98","pic_url":"http://img3.handybest.com/Uploads/topic/34/14539671969898.jpg!phone","content":"因偶然而遇见这座占据整座山的寺庙，很少为中国游客所知，来这里行修的大多数为当地人和一些欧洲信奉佛教的虔心之客。\r\n\r\n整整一座山，美到让人窒息，寺庙执事应允可对部分有信仰的中国客户开放，在这座清静绝美之地，来一次身心灵的涤荡。","create_time":"0","p_sort":"5","last_update":"0","t_status":"1","pic_size":{"0":800,"1":493,"2":2,"3":"width=\"800\" height=\"493\"","bits":8,"channels":3,"mime":"image/jpeg"}}]},{"id":"99","tid":"34","create_time":"1453967234","last_update":"1454471562","t_sort":"27","t_status":"1","tag_title":"二日禅修之旅安排","pict":[{"id":"259","tid":"34","did":"99","pic_url":"http://img1.handybest.com/Uploads/topic/34/14539672602555.jpg!phone","content":"第一天：\r\n管家前往酒店接到客人后前往信贵山，在寺庙办理入住，后自由观光或由管家辅助了解寺院可执行行修项目，参与行修。\r\n\r\n第二天：\r\n行修祈祷的一天，下午离开可前往周边观光","create_time":"0","p_sort":"30","last_update":"0","t_status":"1","pic_size":{"0":800,"1":450,"2":2,"3":"width=\"800\" height=\"450\"","bits":8,"channels":3,"mime":"image/jpeg"}},{"id":"260","tid":"34","did":"99","pic_url":"http://img3.handybest.com/Uploads/topic/34/14539673011084.jpg!phone","content":"【关于禅修与祈祷】\r\n\r\n听取座禅的指导与祈福（如需法衣可租用，参考价格：2000日元／天）\r\n\r\n【专业禅修参考】\r\n\r\n9:00～ 9:55\t法話\r\n10:00～10:30\t百八礼拝\r\n10:30～11:10\t阿息観\r\n11:15～12:15\t大般若祈祷・戒壇めぐり諸堂参拝\r\n12:30～13:00\t食事作法と食事\r\n13:15～14:05\t般若心経と食事作法解説\r\n14:15～16:00\t心経読経と写経","create_time":"0","p_sort":"28","last_update":"0","t_status":"1","pic_size":{"0":415,"1":202,"2":2,"3":"width=\"415\" height=\"202\"","bits":8,"channels":3,"mime":"image/jpeg"}},{"id":"261","tid":"34","did":"99","pic_url":"http://img2.handybest.com/Uploads/topic/34/14539673424303.jpg!phone","content":"【祈祷流程】\r\n\r\n1.在本堂（正殿）、塔頭（寺内的小寺）或者宿坊（所住客室）内填写申请表。\r\n受理时间：\r\n本堂（正殿）\t9時～16時\t\r\n塔頭（寺内的小寺）或者宿坊（所住客室）\t随時\t\r\n2.申请后，进入本堂（正殿）内等候。\r\n3.跟着执行法事的僧侣认真地进行祈祷。\r\n4.直到祈祷结束都要安静地在内阵之内，祈祷的过程中参拜毗沙门天王和二十八使者像。\r\n5.祈祷完成之后赐予写有姓名的纸签或木牌。\r\n\r\n备注：寺庙中不同祈祷所需料金不同，可根据现场希望祈愿的内容直接向寺院支付料金\r\n","create_time":"0","p_sort":"26","last_update":"0","t_status":"1","pic_size":{"0":800,"1":585,"2":2,"3":"width=\"800\" height=\"585\"","bits":8,"channels":3,"mime":"image/jpeg"}}]},{"id":"100","tid":"34","create_time":"1453967389","last_update":"1454471565","t_sort":"25","t_status":"1","tag_title":"关于宿泊","pict":[{"id":"263","tid":"34","did":"100","pic_url":"http://img2.handybest.com/Uploads/topic/34/145396740528.jpg!phone","content":"宿泊安排在朴素典雅的日式斋房，2-4人一间","create_time":"0","p_sort":"5","last_update":"0","t_status":"1","pic_size":{"0":415,"1":266,"2":2,"3":"width=\"415\" height=\"266\"","bits":8,"channels":3,"mime":"image/jpeg"}}]},{"id":"101","tid":"34","create_time":"1453967458","last_update":"1453967986","t_sort":"24","t_status":"1","tag_title":"关于餐食","pict":[{"id":"264","tid":"34","did":"101","pic_url":"http://img2.handybest.com/Uploads/topic/34/14539674685323.jpg!phone","content":"餐食安排为精进或会席料理，套餐中已包含","create_time":"0","p_sort":"5","last_update":"0","t_status":"1","pic_size":{"0":314,"1":111,"2":2,"3":"width=\"314\" height=\"111\"","bits":8,"channels":3,"mime":"image/jpeg"}}]},{"id":"102","tid":"34","create_time":"1453967540","last_update":"1453967984","t_sort":"22","t_status":"1","tag_title":"寺庙平面图及环境","pict":[{"id":"265","tid":"34","did":"102","pic_url":"http://img2.handybest.com/Uploads/topic/34/14539675525182.jpg!phone","content":"","create_time":"0","p_sort":"8","last_update":"0","t_status":"1","pic_size":{"0":415,"1":292,"2":2,"3":"width=\"415\" height=\"292\"","bits":8,"channels":3,"mime":"image/jpeg"}},{"id":"266","tid":"34","did":"102","pic_url":"http://img3.handybest.com/Uploads/topic/34/14539675719118.jpg!phone","content":"","create_time":"0","p_sort":"7","last_update":"0","t_status":"1","pic_size":{"0":800,"1":452,"2":2,"3":"width=\"800\" height=\"452\"","bits":8,"channels":3,"mime":"image/jpeg"}},{"id":"267","tid":"34","did":"102","pic_url":"http://img1.handybest.com/Uploads/topic/34/14539675875081.jpg!phone","content":"","create_time":"0","p_sort":"6","last_update":"0","t_status":"1","pic_size":{"0":415,"1":269,"2":2,"3":"width=\"415\" height=\"269\"","bits":8,"channels":3,"mime":"image/jpeg"}},{"id":"268","tid":"34","did":"102","pic_url":"http://img3.handybest.com/Uploads/topic/34/14539676013386.jpg!phone","content":"","create_time":"0","p_sort":"5","last_update":"0","t_status":"1","pic_size":{"0":415,"1":268,"2":2,"3":"width=\"415\" height=\"268\"","bits":8,"channels":3,"mime":"image/jpeg"}},{"id":"269","tid":"34","did":"102","pic_url":"http://img2.handybest.com/Uploads/topic/34/1453967620985.jpg!phone","content":"","create_time":"0","p_sort":"4","last_update":"0","t_status":"1","pic_size":{"0":415,"1":277,"2":2,"3":"width=\"415\" height=\"277\"","bits":8,"channels":3,"mime":"image/jpeg"}},{"id":"270","tid":"34","did":"102","pic_url":"http://img1.handybest.com/Uploads/topic/34/1453967634462.jpg!phone","content":"","create_time":"0","p_sort":"3","last_update":"0","t_status":"1","pic_size":{"0":640,"1":452,"2":2,"3":"width=\"640\" height=\"452\"","bits":8,"channels":3,"mime":"image/jpeg"}}]},{"id":"103","tid":"34","create_time":"1453967659","last_update":"1453967982","t_sort":"21","t_status":"1","tag_title":"预订说明","pict":[{"id":"271","tid":"34","did":"103","pic_url":false,"content":"【预订说明】\r\n1.此产品如需订购请至少提前一周以上；\r\n2.行修产品由于寺庙语言沟通问题及行修日程执行环节需提示，全程匹配中文小一管家进行翻译与陪同；\r\n3.寺庙行修与酒店不同，雅致的环境中只有僧人做简单服务，请勿与酒店服务做比较。公共风吕浴池，斋房无上锁，请务必遵守行修日程时间规定，不要产生不守时等现象。\r\n4.此产品费用根据人数不同有浮动：\r\n3380元／人（4人团）\r\n3980元／人（3人团）\r\n5380元／人（2人团）\r\n其他人数请电话咨询\r\n5.此产品不接受单人预订，产品价格为4人团的单人预订价格，请购买4次。如2人团购买请联系客服改价。","create_time":"0","p_sort":"5","last_update":"0","t_status":"1","pic_size":false}]},{"id":"104","tid":"34","create_time":"1453967843","last_update":"1453967981","t_sort":"20","t_status":"1","tag_title":"费用说明","pict":[{"id":"272","tid":"34","did":"104","pic_url":"http://img3.handybest.com/Uploads/topic/34/14539679088995.jpg!phone","content":"【费用包含】\r\n1.2日高端商务车阿尔法用车（7-8座）全天用车费\r\n（酒店接送至寺庙，返回，或多余时间的市区观光均含，每天10小时300公里。如超公里，10公里2000日元；超时，每小时5000日元，此部分可现付管家）\r\n2.管家全程服务费及翻译费（含一晚管家附近住宿）\r\n3.寺庙住宿及早晚餐费用（第一天晚餐与第二天早餐） 2-4人均住一间房\r\n\r\n费用不包含：\r\n寺庙中祈祷等其他个人参与事项的花费","create_time":"0","p_sort":"5","last_update":"0","t_status":"1","pic_size":{"0":800,"1":534,"2":2,"3":"width=\"800\" height=\"534\"","bits":8,"channels":3,"mime":"image/jpeg"}}]},{"id":"105","tid":"34","create_time":"1453967930","last_update":"1453967979","t_sort":"18","t_status":"1","tag_title":"取消政策","pict":[{"id":"273","tid":"34","did":"105","pic_url":"http://img2.handybest.com/Uploads/topic/34/1453967970285.jpg!phone","content":"1.我们会尽可能按照行程中合作机构规定进行沟通协调，根据实际情况进行退款；\r\n2.预定后出发前30天以上取消退全款90%，15天以上30天以内取消退全款40%，15天及以内不予退款。\r\n3.第二点退款政策基于第一点实际情况（如涉及到提前预定的酒店或预付款项目时），当无法包含第一点时，按照第一点实际情况＋第二点政策执行退款。\r\n","create_time":"0","p_sort":"5","last_update":"0","t_status":"1","pic_size":{"0":800,"1":485,"2":2,"3":"width=\"800\" height=\"485\"","bits":8,"channels":3,"mime":"image/jpeg"}}]}]
     */

    private DataBean data;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private String id;
        private String title;
        private String sub_title;
        private String addr;
        private String tel;
        private String head_pic;
        private String t_sort;
        private String create_time;
        private String t_status;
        private String start_time;
        private String end_time;
        private String t_type;
        private String goods_id;
        private String small_title;
        /**
         * 0 : 501
         * 1 : 332
         * 2 : 2
         * 3 : width="501" height="332"
         * bits : 8
         * channels : 3
         * mime : image/jpeg
         */

        private SizePicBean size_pic;
        /**
         * id : 97
         * tid : 34
         * create_time : 1453967076
         * last_update : 1453967992
         * t_sort : 30
         * t_status : 1
         * tag_title : 遇见一片桃源
         * pict : [{"id":"257","tid":"34","did":"97","pic_url":"http://img2.handybest.com/Uploads/topic/34/14539671192656.jpg!phone","content":"在古老的奈良，有这样一座坐落在半山的世外桃源般的地方，它是圣德太子在天王庇佑取得战争胜利后创建伽蓝之地。七福神之一的毘沙门天，作为生意兴隆和家人平安之神受到人们的信仰，便供奉在这座寺庙里。在这里可以体验行修，坐禅，抄经，祈福，真正感受一次日本僧侣的生活，让身体和灵魂进行一次完美的结合。","create_time":"0","p_sort":"5","last_update":"0","t_status":"1","pic_size":{"0":651,"1":391,"2":2,"3":"width=\"651\" height=\"391\"","bits":8,"channels":3,"mime":"image/jpeg"}}]
         */

        private List<DetailsBean> details;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSub_title() {
            return sub_title;
        }

        public void setSub_title(String sub_title) {
            this.sub_title = sub_title;
        }

        public String getAddr() {
            return addr;
        }

        public void setAddr(String addr) {
            this.addr = addr;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }

        public String getHead_pic() {
            return head_pic;
        }

        public void setHead_pic(String head_pic) {
            this.head_pic = head_pic;
        }

        public String getT_sort() {
            return t_sort;
        }

        public void setT_sort(String t_sort) {
            this.t_sort = t_sort;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public String getT_status() {
            return t_status;
        }

        public void setT_status(String t_status) {
            this.t_status = t_status;
        }

        public String getStart_time() {
            return start_time;
        }

        public void setStart_time(String start_time) {
            this.start_time = start_time;
        }

        public String getEnd_time() {
            return end_time;
        }

        public void setEnd_time(String end_time) {
            this.end_time = end_time;
        }

        public String getT_type() {
            return t_type;
        }

        public void setT_type(String t_type) {
            this.t_type = t_type;
        }

        public String getGoods_id() {
            return goods_id;
        }

        public void setGoods_id(String goods_id) {
            this.goods_id = goods_id;
        }

        public String getSmall_title() {
            return small_title;
        }

        public void setSmall_title(String small_title) {
            this.small_title = small_title;
        }

        public SizePicBean getSize_pic() {
            return size_pic;
        }

        public void setSize_pic(SizePicBean size_pic) {
            this.size_pic = size_pic;
        }

        public List<DetailsBean> getDetails() {
            return details;
        }

        public void setDetails(List<DetailsBean> details) {
            this.details = details;
        }

        public static class SizePicBean {
            @SerializedName("0")
            private int value0;
            @SerializedName("1")
            private int value1;
            @SerializedName("2")
            private int value2;
            @SerializedName("3")
            private String value3;
            private int bits;
            private int channels;
            private String mime;

            public int getValue0() {
                return value0;
            }

            public void setValue0(int value0) {
                this.value0 = value0;
            }

            public int getValue1() {
                return value1;
            }

            public void setValue1(int value1) {
                this.value1 = value1;
            }

            public int getValue2() {
                return value2;
            }

            public void setValue2(int value2) {
                this.value2 = value2;
            }

            public String getValue3() {
                return value3;
            }

            public void setValue3(String value3) {
                this.value3 = value3;
            }

            public int getBits() {
                return bits;
            }

            public void setBits(int bits) {
                this.bits = bits;
            }

            public int getChannels() {
                return channels;
            }

            public void setChannels(int channels) {
                this.channels = channels;
            }

            public String getMime() {
                return mime;
            }

            public void setMime(String mime) {
                this.mime = mime;
            }
        }

        public static class DetailsBean {
            private String id;
            private String tid;
            private String create_time;
            private String last_update;
            private String t_sort;
            private String t_status;
            private String tag_title;
            /**
             * id : 257
             * tid : 34
             * did : 97
             * pic_url : http://img2.handybest.com/Uploads/topic/34/14539671192656.jpg!phone
             * content : 在古老的奈良，有这样一座坐落在半山的世外桃源般的地方，它是圣德太子在天王庇佑取得战争胜利后创建伽蓝之地。七福神之一的毘沙门天，作为生意兴隆和家人平安之神受到人们的信仰，便供奉在这座寺庙里。在这里可以体验行修，坐禅，抄经，祈福，真正感受一次日本僧侣的生活，让身体和灵魂进行一次完美的结合。
             * create_time : 0
             * p_sort : 5
             * last_update : 0
             * t_status : 1
             * pic_size : {"0":651,"1":391,"2":2,"3":"width=\"651\" height=\"391\"","bits":8,"channels":3,"mime":"image/jpeg"}
             */

            private List<PictBean> pict;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getTid() {
                return tid;
            }

            public void setTid(String tid) {
                this.tid = tid;
            }

            public String getCreate_time() {
                return create_time;
            }

            public void setCreate_time(String create_time) {
                this.create_time = create_time;
            }

            public String getLast_update() {
                return last_update;
            }

            public void setLast_update(String last_update) {
                this.last_update = last_update;
            }

            public String getT_sort() {
                return t_sort;
            }

            public void setT_sort(String t_sort) {
                this.t_sort = t_sort;
            }

            public String getT_status() {
                return t_status;
            }

            public void setT_status(String t_status) {
                this.t_status = t_status;
            }

            public String getTag_title() {
                return tag_title;
            }

            public void setTag_title(String tag_title) {
                this.tag_title = tag_title;
            }

            public List<PictBean> getPict() {
                return pict;
            }

            public void setPict(List<PictBean> pict) {
                this.pict = pict;
            }

            public static class PictBean {
                private String id;
                private String tid;
                private String did;
                private String pic_url;
                private String content;
                private String create_time;
                private String p_sort;
                private String last_update;
                private String t_status;

                @Override
                public String toString() {
                    return "PictBean{" +
                            "id='" + id + '\'' +
                            ", tid='" + tid + '\'' +
                            ", did='" + did + '\'' +
                            ", pic_url='" + pic_url + '\'' +
                            ", content='" + content + '\'' +
                            ", create_time='" + create_time + '\'' +
                            ", p_sort='" + p_sort + '\'' +
                            ", last_update='" + last_update + '\'' +
                            ", t_status='" + t_status + '\'' +
                            ", size_pic=" + size_pic +
                            '}';
                }

                /**
                 * 0 : 651
                 * 1 : 391
                 * 2 : 2
                 * 3 : width="651" height="391"
                 * bits : 8
                 * channels : 3
                 * mime : image/jpeg
                 */

                private PicSizeBean size_pic;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getTid() {
                    return tid;
                }

                public void setTid(String tid) {
                    this.tid = tid;
                }

                public String getDid() {
                    return did;
                }

                public void setDid(String did) {
                    this.did = did;
                }

                public String getPic_url() {
                    return pic_url;
                }

                public void setPic_url(String pic_url) {
                    this.pic_url = pic_url;
                }

                public String getContent() {
                    return content;
                }

                public void setContent(String content) {
                    this.content = content;
                }

                public String getCreate_time() {
                    return create_time;
                }

                public void setCreate_time(String create_time) {
                    this.create_time = create_time;
                }

                public String getP_sort() {
                    return p_sort;
                }

                public void setP_sort(String p_sort) {
                    this.p_sort = p_sort;
                }

                public String getLast_update() {
                    return last_update;
                }

                public void setLast_update(String last_update) {
                    this.last_update = last_update;
                }

                public String getT_status() {
                    return t_status;
                }

                public void setT_status(String t_status) {
                    this.t_status = t_status;
                }

                public PicSizeBean getPic_size() {
                    return size_pic;
                }

                public void setPic_size(PicSizeBean size_pic) {
                    this.size_pic = size_pic;
                }

                public static class PicSizeBean {
                    @SerializedName("0")
                    private int value0;
                    @SerializedName("1")
                    private int value1;
                    @SerializedName("2")
                    private int value2;
                    @SerializedName("3")
                    private String value3;
                    private int bits;
                    private int channels;
                    private String mime;

                    public int getValue0() {
                        return value0;
                    }

                    public void setValue0(int value0) {
                        this.value0 = value0;
                    }

                    public int getValue1() {
                        return value1;
                    }

                    public void setValue1(int value1) {
                        this.value1 = value1;
                    }

                    public int getValue2() {
                        return value2;
                    }

                    public void setValue2(int value2) {
                        this.value2 = value2;
                    }

                    public String getValue3() {
                        return value3;
                    }

                    public void setValue3(String value3) {
                        this.value3 = value3;
                    }

                    public int getBits() {
                        return bits;
                    }

                    public void setBits(int bits) {
                        this.bits = bits;
                    }

                    public int getChannels() {
                        return channels;
                    }

                    public void setChannels(int channels) {
                        this.channels = channels;
                    }

                    public String getMime() {
                        return mime;
                    }

                    public void setMime(String mime) {
                        this.mime = mime;
                    }
                }
            }
        }
    }
}
