package com.example.lesson.app.data.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CategoryBean {


    /**
     * msg : success
     * code : 0
     * data : {"stages":{"-739657361":{"subTags":[{"tagId":1416,"tagType":"subject","tagName":"语文","nextStage":-1},{"tagId":1418,"tagType":"subject","tagName":"数学","nextStage":-1},{"tagId":1420,"tagType":"subject","tagName":"英语","nextStage":-1},{"tagId":1528,"tagType":"subject","tagName":"少儿编程","nextStage":-1},{"tagId":2058,"tagType":"subject","tagName":"少儿美术","nextStage":-1},{"tagId":1928,"tagType":"subject","tagName":"家长频道","nextStage":-1}],"id":"-739657361","showNext":true,"title":"小学一年级科目","multiType":"radio"},"-842753927":{"subTags":[{"tagId":926,"tagType":"subject","tagName":"高一","nextStage":"-686187771"},{"tagId":928,"tagType":"subject","tagName":"高二","nextStage":"1864008760"},{"tagId":930,"tagType":"subject","tagName":"高三","nextStage":"-855824338"}],"id":"-842753927","showNext":"false","title":"高中","multiType":"radio"},"-75911651":{"subTags":[{"tagId":2366,"tagType":"subject","tagName":"卡搭编程","nextStage":-1},{"tagId":2368,"tagType":"subject","tagName":"有道乐读","nextStage":-1},{"tagId":2370,"tagType":"subject","tagName":"少儿美术","nextStage":-1}],"id":"-75911651","showNext":true,"title":"2-7岁","multiType":"radio"},"1173426265":{"subTags":[{"tagId":1452,"tagType":"subject","tagName":"语文","nextStage":"-1"},{"tagId":1454,"tagType":"subject","tagName":"数学","nextStage":"-1"},{"tagId":1456,"tagType":"subject","tagName":"英语","nextStage":"-1"},{"tagId":1936,"tagType":"subject","tagName":"物理","nextStage":"-1"},{"tagId":1930,"tagType":"subject","tagName":"家长频道","nextStage":"-1"}],"id":"1173426265","showNext":true,"title":"初一科目","multiType":"radio"},"1762259370":{"subTags":[{"tagId":1446,"tagType":"subject","tagName":"语文","nextStage":-1},{"tagId":1448,"tagType":"subject","tagName":"数学","nextStage":-1},{"tagId":1450,"tagType":"subject","tagName":"英语","nextStage":-1},{"tagId":1874,"tagType":"subject","tagName":"新初一","nextStage":-1},{"tagId":1528,"tagType":"subject","tagName":"少儿编程","nextStage":-1},{"tagId":1928,"tagType":"subject","tagName":"家长频道","nextStage":-1}],"id":"1762259370","showNext":true,"title":"小学六年级科目","multiType":"radio"},"1099221270":{"subTags":[{"tagId":1428,"tagType":"subject","tagName":"语文","nextStage":-1},{"tagId":1430,"tagType":"subject","tagName":"数学","nextStage":-1},{"tagId":1432,"tagType":"subject","tagName":"英语","nextStage":-1},{"tagId":1528,"tagType":"subject","tagName":"少儿编程","nextStage":-1},{"tagId":1928,"tagType":"subject","tagName":"家长频道","nextStage":-1}],"id":"1099221270","showNext":true,"title":"小学三年级科目","multiType":"radio"},"-583494580":{"subTags":[{"tagId":1400,"tagType":"subject","tagName":"研一","nextStage":"-11770465"},{"tagId":1402,"tagType":"subject","tagName":"研二等","nextStage":"-11770465"}],"id":"-583494580","showNext":true,"title":"研究生","multiType":"radio"},"-382633109":{"subTags":[{"tagId":2364,"tagType":"subject","tagName":"2-7岁","nextStage":"-75911651"}],"id":"-382633109","showNext":false,"title":"学前","multiType":"radio"},"154271985":{"subTags":[{"tagId":1276,"tagType":"subject","tagName":"学前","nextStage":"-382633109"},{"tagId":430,"tagType":"group","tagName":"小学","nextStage":"1773877388"},{"tagId":432,"tagType":"group","tagName":"初中","nextStage":"1003657994"},{"tagId":410,"tagType":"group","tagName":"高中","nextStage":"-842753927"},{"tagId":908,"tagName":"大学","nextStage":"-340228195"},{"tagId":1386,"tagType":"group","tagName":"其他","nextStage":"1832454640"}],"id":"154271985","showNext":true,"title":"您所处的阶段是","multiType":"radio"},"-340228195":{"subTags":[{"tagId":1392,"tagType":"subject","tagName":"大一","nextStage":"-1293367281"},{"tagId":1394,"tagType":"subject","tagName":"大二","nextStage":"-590253001"},{"tagId":1396,"tagType":"subject","tagName":"大三","nextStage":"65414353"},{"tagId":1398,"tagType":"subject","tagName":"大四","nextStage":"-11770465"},{"tagId":1384,"tagType":"group","tagName":"研究生","nextStage":"-11770465"}],"id":"-340228195","showNext":"true","title":"本科","multiType":"radio"},"-590253001":{"subTags":[{"tagId":870,"tagType":"subject","tagName":"四六级","nextStage":-1},{"tagId":414,"tagType":"subject","tagName":"英语提升","nextStage":-1},{"tagId":424,"tagType":"subject","tagName":"考研","nextStage":-1},{"tagId":1110,"tagType":"subject","tagName":"兴趣技能","nextStage":-1},{"tagId":828,"tagType":"subject","tagName":"逻辑英语","nextStage":-1},{"tagId":418,"tagType":"subject","tagName":"小语种","nextStage":-1},{"tagId":572,"tagType":"subject","tagName":"雅思托福","nextStage":-1},{"tagId":896,"tagType":"subject","tagName":"专四专八","nextStage":-1},{"tagId":458,"tagType":"subject","tagName":"教师资格","nextStage":-1},{"tagId":1542,"tagType":"subject","tagName":"职业考证","nextStage":-1},{"tagId":1078,"tagType":"subject","tagName":"编程开发","nextStage":-1}],"id":"-590253001","showNext":"false","title":"大二兴趣","multiType":"checkbox","nextStage":-1},"-1643733803":{"subTags":[{"tagId":1440,"tagType":"subject","tagName":"语文","nextStage":-1},{"tagId":1442,"tagType":"subject","tagName":"数学","nextStage":-1},{"tagId":1444,"tagType":"subject","tagName":"英语","nextStage":-1},{"tagId":1528,"tagType":"subject","tagName":"少儿编程","nextStage":-1},{"tagId":1928,"tagType":"subject","tagName":"家长频道","nextStage":-1}],"id":"-1643733803","showNext":true,"title":"小学五年级科目","multiType":"radio"},"-11770465":{"subTags":[{"tagId":414,"tagType":"subject","tagName":"英语提升","nextStage":-1},{"tagId":870,"tagType":"subject","tagName":"四六级","nextStage":-1},{"tagId":424,"tagType":"subject","tagName":"考研","nextStage":-1},{"tagId":1110,"tagType":"subject","tagName":"兴趣技能","nextStage":-1},{"tagId":828,"tagType":"subject","tagName":"逻辑英语","nextStage":-1},{"tagId":418,"tagType":"subject","tagName":"小语种","nextStage":-1},{"tagId":572,"tagType":"subject","tagName":"雅思托福","nextStage":-1},{"tagId":896,"tagType":"subject","tagName":"专四专八","nextStage":-1},{"tagId":458,"tagType":"subject","tagName":"教师资格","nextStage":-1},{"tagId":1542,"tagType":"subject","tagName":"职业考证","nextStage":-1},{"tagId":1078,"tagType":"subject","tagName":"编程开发","nextStage":-1}],"id":"-11770465","showNext":"false","title":"兴趣选项","multiType":"checkbox","nextStage":-1},"1832454640":{"subTags":[{"tagId":1404,"tagType":"subject","tagName":"上班族","nextStage":"-11770465"},{"tagId":1406,"tagType":"subject","tagName":"求职者","nextStage":"-11770465"},{"tagId":1408,"tagType":"subject","tagName":"自由派","nextStage":"-11770465"}],"id":"1832454640","showNext":true,"title":"其他","multiType":"radio"},"1521900098":{"subTags":[{"tagId":1458,"tagType":"subject","tagName":"语文","nextStage":"-1"},{"tagId":1460,"tagType":"subject","tagName":"数学","nextStage":"-1"},{"tagId":1462,"tagType":"subject","tagName":"英语","nextStage":"-1"},{"tagId":1538,"tagType":"subject","tagName":"物理","nextStage":"-1"},{"tagId":2360,"tagType":"subject","tagName":"化学","nextStage":"-1"},{"tagId":2446,"tagType":"subject","tagName":"生物","nextStage":"-1"},{"tagId":1930,"tagType":"subject","tagName":"家长频道","nextStage":"-1"}],"id":"1521900098","showNext":true,"title":"初二科目","multiType":"radio"},"386667459":{"subTags":[{"tagId":1464,"tagType":"subject","tagName":"语文","nextStage":"-1"},{"tagId":1466,"tagType":"subject","tagName":"数学","nextStage":"-1"},{"tagId":1468,"tagType":"subject","tagName":"英语","nextStage":"-1"},{"tagId":1534,"tagType":"subject","tagName":"物理","nextStage":"-1"},{"tagId":1536,"tagType":"subject","tagName":"化学","nextStage":"-1"},{"tagId":2448,"tagType":"subject","tagName":"生物","nextStage":"-1"},{"tagId":1930,"tagType":"subject","tagName":"家长频道","nextStage":"-1"}],"id":"386667459","showNext":false,"title":"初三科目","multiType":"radio"},"-1293367281":{"subTags":[{"tagId":414,"tagType":"subject","tagName":"英语提升","nextStage":-1},{"tagId":870,"tagType":"subject","tagName":"四六级","nextStage":-1},{"tagId":424,"tagType":"subject","tagName":"考研","nextStage":-1},{"tagId":1110,"tagType":"subject","tagName":"兴趣技能","nextStage":-1},{"tagId":828,"tagType":"subject","tagName":"逻辑英语","nextStage":-1},{"tagId":418,"tagType":"subject","tagName":"小语种","nextStage":-1},{"tagId":572,"tagType":"subject","tagName":"雅思托福","nextStage":-1},{"tagId":896,"tagType":"subject","tagName":"专四专八","nextStage":-1},{"tagId":458,"tagType":"subject","tagName":"教师资格","nextStage":-1},{"tagId":1542,"tagType":"subject","tagName":"职业考证","nextStage":-1},{"tagId":1078,"tagType":"subject","tagName":"编程开发","nextStage":-1}],"id":"-1293367281","showNext":"false","title":"大一兴趣","multiType":"checkbox","nextStage":-1},"65414353":{"subTags":[{"tagId":424,"tagType":"subject","tagName":"考研","nextStage":-1},{"tagId":870,"tagType":"subject","tagName":"四六级","nextStage":-1},{"tagId":414,"tagType":"subject","tagName":"英语提升","nextStage":-1},{"tagId":1110,"tagType":"subject","tagName":"兴趣技能","nextStage":-1},{"tagId":828,"tagType":"subject","tagName":"逻辑英语","nextStage":-1},{"tagId":418,"tagType":"subject","tagName":"小语种","nextStage":-1},{"tagId":572,"tagType":"subject","tagName":"雅思托福","nextStage":-1},{"tagId":896,"tagType":"subject","tagName":"专四专八","nextStage":-1},{"tagId":458,"tagType":"subject","tagName":"教师资格","nextStage":-1},{"tagId":1542,"tagType":"subject","tagName":"职业考证","nextStage":-1},{"tagId":1078,"tagType":"subject","tagName":"编程开发","nextStage":-1}],"id":"65414353","showNext":"false","title":"大三兴趣","multiType":"checkbox","nextStage":-1},"1773877388":{"subTags":[{"tagId":1062,"tagType":"subject","tagName":"一年级","nextStage":"-739657361"},{"tagId":1064,"tagType":"subject","tagName":"二年级","nextStage":"-1267607113"},{"tagId":1066,"tagType":"subject","tagName":"三年级","nextStage":"1099221270"},{"tagId":1068,"tagType":"subject","tagName":"四年级","nextStage":"-1241354076"},{"tagId":1070,"tagType":"subject","tagName":"五年级","nextStage":"-1643733803"},{"tagId":1072,"tagType":"subject","tagName":"六年级","nextStage":"1762259370"}],"id":"1773877388","showNext":"false","title":"小学","multiType":"radio"},"1864008760":{"subTags":[{"tagId":2054,"tagType":"subject","tagName":"寒春新课","nextStage":"-1"},{"tagId":1480,"tagType":"subject","tagName":"语文","nextStage":"-1"},{"tagId":1474,"tagType":"subject","tagName":"英语","nextStage":"-1"},{"tagId":1486,"tagType":"subject","tagName":"数学","nextStage":"-1"},{"tagId":1492,"tagType":"subject","tagName":"物理","nextStage":"-1"},{"tagId":1498,"tagType":"subject","tagName":"化学","nextStage":"-1"},{"tagId":1504,"tagType":"subject","tagName":"生物","nextStage":"-1"},{"tagId":1510,"tagType":"subject","tagName":"地理","nextStage":"-1"},{"tagId":1516,"tagType":"subject","tagName":"历史","nextStage":"-1"},{"tagId":1522,"tagType":"subject","tagName":"政治","nextStage":"-1"},{"tagId":1932,"tagType":"subject","tagName":"学霸访谈","nextStage":"-1"}],"id":"1864008760","showNext":true,"title":"高二科目","multiType":"radio"},"-1241354076":{"subTags":[{"tagId":1434,"tagType":"subject","tagName":"语文","nextStage":-1},{"tagId":1436,"tagType":"subject","tagName":"数学","nextStage":-1},{"tagId":1438,"tagType":"subject","tagName":"英语","nextStage":-1},{"tagId":1528,"tagType":"subject","tagName":"少儿编程","nextStage":-1},{"tagId":1928,"tagType":"subject","tagName":"家长频道","nextStage":-1}],"id":"-1241354076","showNext":true,"title":"小学四年级科目","multiType":"radio"},"1003657994":{"subTags":[{"tagId":1224,"tagType":"subject","tagName":"初一","nextStage":"1173426265"},{"tagId":1226,"tagType":"subject","tagName":"初二","nextStage":"1521900098"},{"tagId":1228,"tagType":"subject","tagName":"初三","nextStage":"386667459"}],"id":"1003657994","showNext":"false","title":"初中","multiType":"radio"},"-855824338":{"subTags":[{"tagId":2056,"tagType":"subject","tagName":"二轮新课","nextStage":"-1"},{"tagId":1482,"tagType":"subject","tagName":"语文","nextStage":"-1"},{"tagId":1488,"tagType":"subject","tagName":"数学","nextStage":"-1"},{"tagId":1476,"tagType":"subject","tagName":"英语","nextStage":"-1"},{"tagId":1494,"tagType":"subject","tagName":"物理","nextStage":"-1"},{"tagId":1500,"tagType":"subject","tagName":"化学","nextStage":"-1"},{"tagId":1506,"tagType":"subject","tagName":"生物","nextStage":"-1"},{"tagId":1518,"tagType":"subject","tagName":"历史","nextStage":"-1"},{"tagId":1512,"tagType":"subject","tagName":"地理","nextStage":"-1"},{"tagId":1524,"tagType":"subject","tagName":"政治","nextStage":"-1"},{"tagId":1932,"tagType":"subject","tagName":"学霸访谈","nextStage":"-1"},{"tagId":2012,"tagType":"sub_subject","tagName":"新大一","nextStage":"-1"}],"id":"-855824338","showNext":true,"title":"高三科目","multiType":"radio"},"-1267607113":{"subTags":[{"tagId":1422,"tagType":"subject","tagName":"语文","nextStage":-1},{"tagId":1424,"tagType":"subject","tagName":"数学","nextStage":-1},{"tagId":1426,"tagType":"subject","tagName":"英语","nextStage":-1},{"tagId":1528,"tagType":"subject","tagName":"少儿编程","nextStage":-1},{"tagId":2086,"tagType":"subject","tagName":"少儿美术","nextStage":-1},{"tagId":1928,"tagType":"subject","tagName":"家长频道","nextStage":-1}],"id":"-1267607113","showNext":true,"title":"小学二年级科目","multiType":"radio"},"-686187771":{"subTags":[{"tagId":2052,"tagType":"subject","tagName":"寒春新课","nextStage":"-1"},{"tagId":1478,"tagType":"subject","tagName":"语文","nextStage":"-1"},{"tagId":1472,"tagType":"subject","tagName":"英语","nextStage":"-1"},{"tagId":1484,"tagType":"subject","tagName":"数学","nextStage":"-1"},{"tagId":1490,"tagType":"subject","tagName":"物理","nextStage":"-1"},{"tagId":1496,"tagType":"subject","tagName":"化学","nextStage":"-1"},{"tagId":1502,"tagType":"subject","tagName":"生物","nextStage":"-1"},{"tagId":1508,"tagType":"subject","tagName":"地理","nextStage":"-1"},{"tagId":1514,"tagType":"subject","tagName":"历史","nextStage":"-1"},{"tagId":1932,"tagType":"subject","tagName":"学霸访谈","nextStage":"-1"}],"id":"-686187771","showNext":true,"title":"高一科目","multiType":"radio"}},"trigger":0,"startStage":"154271985"}
     */

    private String msg;
    private String code;
    private DataBean data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * stages : {"-739657361":{"subTags":[{"tagId":1416,"tagType":"subject","tagName":"语文","nextStage":-1},{"tagId":1418,"tagType":"subject","tagName":"数学","nextStage":-1},{"tagId":1420,"tagType":"subject","tagName":"英语","nextStage":-1},{"tagId":1528,"tagType":"subject","tagName":"少儿编程","nextStage":-1},{"tagId":2058,"tagType":"subject","tagName":"少儿美术","nextStage":-1},{"tagId":1928,"tagType":"subject","tagName":"家长频道","nextStage":-1}],"id":"-739657361","showNext":true,"title":"小学一年级科目","multiType":"radio"},"-842753927":{"subTags":[{"tagId":926,"tagType":"subject","tagName":"高一","nextStage":"-686187771"},{"tagId":928,"tagType":"subject","tagName":"高二","nextStage":"1864008760"},{"tagId":930,"tagType":"subject","tagName":"高三","nextStage":"-855824338"}],"id":"-842753927","showNext":"false","title":"高中","multiType":"radio"},"-75911651":{"subTags":[{"tagId":2366,"tagType":"subject","tagName":"卡搭编程","nextStage":-1},{"tagId":2368,"tagType":"subject","tagName":"有道乐读","nextStage":-1},{"tagId":2370,"tagType":"subject","tagName":"少儿美术","nextStage":-1}],"id":"-75911651","showNext":true,"title":"2-7岁","multiType":"radio"},"1173426265":{"subTags":[{"tagId":1452,"tagType":"subject","tagName":"语文","nextStage":"-1"},{"tagId":1454,"tagType":"subject","tagName":"数学","nextStage":"-1"},{"tagId":1456,"tagType":"subject","tagName":"英语","nextStage":"-1"},{"tagId":1936,"tagType":"subject","tagName":"物理","nextStage":"-1"},{"tagId":1930,"tagType":"subject","tagName":"家长频道","nextStage":"-1"}],"id":"1173426265","showNext":true,"title":"初一科目","multiType":"radio"},"1762259370":{"subTags":[{"tagId":1446,"tagType":"subject","tagName":"语文","nextStage":-1},{"tagId":1448,"tagType":"subject","tagName":"数学","nextStage":-1},{"tagId":1450,"tagType":"subject","tagName":"英语","nextStage":-1},{"tagId":1874,"tagType":"subject","tagName":"新初一","nextStage":-1},{"tagId":1528,"tagType":"subject","tagName":"少儿编程","nextStage":-1},{"tagId":1928,"tagType":"subject","tagName":"家长频道","nextStage":-1}],"id":"1762259370","showNext":true,"title":"小学六年级科目","multiType":"radio"},"1099221270":{"subTags":[{"tagId":1428,"tagType":"subject","tagName":"语文","nextStage":-1},{"tagId":1430,"tagType":"subject","tagName":"数学","nextStage":-1},{"tagId":1432,"tagType":"subject","tagName":"英语","nextStage":-1},{"tagId":1528,"tagType":"subject","tagName":"少儿编程","nextStage":-1},{"tagId":1928,"tagType":"subject","tagName":"家长频道","nextStage":-1}],"id":"1099221270","showNext":true,"title":"小学三年级科目","multiType":"radio"},"-583494580":{"subTags":[{"tagId":1400,"tagType":"subject","tagName":"研一","nextStage":"-11770465"},{"tagId":1402,"tagType":"subject","tagName":"研二等","nextStage":"-11770465"}],"id":"-583494580","showNext":true,"title":"研究生","multiType":"radio"},"-382633109":{"subTags":[{"tagId":2364,"tagType":"subject","tagName":"2-7岁","nextStage":"-75911651"}],"id":"-382633109","showNext":false,"title":"学前","multiType":"radio"},"154271985":{"subTags":[{"tagId":1276,"tagType":"subject","tagName":"学前","nextStage":"-382633109"},{"tagId":430,"tagType":"group","tagName":"小学","nextStage":"1773877388"},{"tagId":432,"tagType":"group","tagName":"初中","nextStage":"1003657994"},{"tagId":410,"tagType":"group","tagName":"高中","nextStage":"-842753927"},{"tagId":908,"tagName":"大学","nextStage":"-340228195"},{"tagId":1386,"tagType":"group","tagName":"其他","nextStage":"1832454640"}],"id":"154271985","showNext":true,"title":"您所处的阶段是","multiType":"radio"},"-340228195":{"subTags":[{"tagId":1392,"tagType":"subject","tagName":"大一","nextStage":"-1293367281"},{"tagId":1394,"tagType":"subject","tagName":"大二","nextStage":"-590253001"},{"tagId":1396,"tagType":"subject","tagName":"大三","nextStage":"65414353"},{"tagId":1398,"tagType":"subject","tagName":"大四","nextStage":"-11770465"},{"tagId":1384,"tagType":"group","tagName":"研究生","nextStage":"-11770465"}],"id":"-340228195","showNext":"true","title":"本科","multiType":"radio"},"-590253001":{"subTags":[{"tagId":870,"tagType":"subject","tagName":"四六级","nextStage":-1},{"tagId":414,"tagType":"subject","tagName":"英语提升","nextStage":-1},{"tagId":424,"tagType":"subject","tagName":"考研","nextStage":-1},{"tagId":1110,"tagType":"subject","tagName":"兴趣技能","nextStage":-1},{"tagId":828,"tagType":"subject","tagName":"逻辑英语","nextStage":-1},{"tagId":418,"tagType":"subject","tagName":"小语种","nextStage":-1},{"tagId":572,"tagType":"subject","tagName":"雅思托福","nextStage":-1},{"tagId":896,"tagType":"subject","tagName":"专四专八","nextStage":-1},{"tagId":458,"tagType":"subject","tagName":"教师资格","nextStage":-1},{"tagId":1542,"tagType":"subject","tagName":"职业考证","nextStage":-1},{"tagId":1078,"tagType":"subject","tagName":"编程开发","nextStage":-1}],"id":"-590253001","showNext":"false","title":"大二兴趣","multiType":"checkbox","nextStage":-1},"-1643733803":{"subTags":[{"tagId":1440,"tagType":"subject","tagName":"语文","nextStage":-1},{"tagId":1442,"tagType":"subject","tagName":"数学","nextStage":-1},{"tagId":1444,"tagType":"subject","tagName":"英语","nextStage":-1},{"tagId":1528,"tagType":"subject","tagName":"少儿编程","nextStage":-1},{"tagId":1928,"tagType":"subject","tagName":"家长频道","nextStage":-1}],"id":"-1643733803","showNext":true,"title":"小学五年级科目","multiType":"radio"},"-11770465":{"subTags":[{"tagId":414,"tagType":"subject","tagName":"英语提升","nextStage":-1},{"tagId":870,"tagType":"subject","tagName":"四六级","nextStage":-1},{"tagId":424,"tagType":"subject","tagName":"考研","nextStage":-1},{"tagId":1110,"tagType":"subject","tagName":"兴趣技能","nextStage":-1},{"tagId":828,"tagType":"subject","tagName":"逻辑英语","nextStage":-1},{"tagId":418,"tagType":"subject","tagName":"小语种","nextStage":-1},{"tagId":572,"tagType":"subject","tagName":"雅思托福","nextStage":-1},{"tagId":896,"tagType":"subject","tagName":"专四专八","nextStage":-1},{"tagId":458,"tagType":"subject","tagName":"教师资格","nextStage":-1},{"tagId":1542,"tagType":"subject","tagName":"职业考证","nextStage":-1},{"tagId":1078,"tagType":"subject","tagName":"编程开发","nextStage":-1}],"id":"-11770465","showNext":"false","title":"兴趣选项","multiType":"checkbox","nextStage":-1},"1832454640":{"subTags":[{"tagId":1404,"tagType":"subject","tagName":"上班族","nextStage":"-11770465"},{"tagId":1406,"tagType":"subject","tagName":"求职者","nextStage":"-11770465"},{"tagId":1408,"tagType":"subject","tagName":"自由派","nextStage":"-11770465"}],"id":"1832454640","showNext":true,"title":"其他","multiType":"radio"},"1521900098":{"subTags":[{"tagId":1458,"tagType":"subject","tagName":"语文","nextStage":"-1"},{"tagId":1460,"tagType":"subject","tagName":"数学","nextStage":"-1"},{"tagId":1462,"tagType":"subject","tagName":"英语","nextStage":"-1"},{"tagId":1538,"tagType":"subject","tagName":"物理","nextStage":"-1"},{"tagId":2360,"tagType":"subject","tagName":"化学","nextStage":"-1"},{"tagId":2446,"tagType":"subject","tagName":"生物","nextStage":"-1"},{"tagId":1930,"tagType":"subject","tagName":"家长频道","nextStage":"-1"}],"id":"1521900098","showNext":true,"title":"初二科目","multiType":"radio"},"386667459":{"subTags":[{"tagId":1464,"tagType":"subject","tagName":"语文","nextStage":"-1"},{"tagId":1466,"tagType":"subject","tagName":"数学","nextStage":"-1"},{"tagId":1468,"tagType":"subject","tagName":"英语","nextStage":"-1"},{"tagId":1534,"tagType":"subject","tagName":"物理","nextStage":"-1"},{"tagId":1536,"tagType":"subject","tagName":"化学","nextStage":"-1"},{"tagId":2448,"tagType":"subject","tagName":"生物","nextStage":"-1"},{"tagId":1930,"tagType":"subject","tagName":"家长频道","nextStage":"-1"}],"id":"386667459","showNext":false,"title":"初三科目","multiType":"radio"},"-1293367281":{"subTags":[{"tagId":414,"tagType":"subject","tagName":"英语提升","nextStage":-1},{"tagId":870,"tagType":"subject","tagName":"四六级","nextStage":-1},{"tagId":424,"tagType":"subject","tagName":"考研","nextStage":-1},{"tagId":1110,"tagType":"subject","tagName":"兴趣技能","nextStage":-1},{"tagId":828,"tagType":"subject","tagName":"逻辑英语","nextStage":-1},{"tagId":418,"tagType":"subject","tagName":"小语种","nextStage":-1},{"tagId":572,"tagType":"subject","tagName":"雅思托福","nextStage":-1},{"tagId":896,"tagType":"subject","tagName":"专四专八","nextStage":-1},{"tagId":458,"tagType":"subject","tagName":"教师资格","nextStage":-1},{"tagId":1542,"tagType":"subject","tagName":"职业考证","nextStage":-1},{"tagId":1078,"tagType":"subject","tagName":"编程开发","nextStage":-1}],"id":"-1293367281","showNext":"false","title":"大一兴趣","multiType":"checkbox","nextStage":-1},"65414353":{"subTags":[{"tagId":424,"tagType":"subject","tagName":"考研","nextStage":-1},{"tagId":870,"tagType":"subject","tagName":"四六级","nextStage":-1},{"tagId":414,"tagType":"subject","tagName":"英语提升","nextStage":-1},{"tagId":1110,"tagType":"subject","tagName":"兴趣技能","nextStage":-1},{"tagId":828,"tagType":"subject","tagName":"逻辑英语","nextStage":-1},{"tagId":418,"tagType":"subject","tagName":"小语种","nextStage":-1},{"tagId":572,"tagType":"subject","tagName":"雅思托福","nextStage":-1},{"tagId":896,"tagType":"subject","tagName":"专四专八","nextStage":-1},{"tagId":458,"tagType":"subject","tagName":"教师资格","nextStage":-1},{"tagId":1542,"tagType":"subject","tagName":"职业考证","nextStage":-1},{"tagId":1078,"tagType":"subject","tagName":"编程开发","nextStage":-1}],"id":"65414353","showNext":"false","title":"大三兴趣","multiType":"checkbox","nextStage":-1},"1773877388":{"subTags":[{"tagId":1062,"tagType":"subject","tagName":"一年级","nextStage":"-739657361"},{"tagId":1064,"tagType":"subject","tagName":"二年级","nextStage":"-1267607113"},{"tagId":1066,"tagType":"subject","tagName":"三年级","nextStage":"1099221270"},{"tagId":1068,"tagType":"subject","tagName":"四年级","nextStage":"-1241354076"},{"tagId":1070,"tagType":"subject","tagName":"五年级","nextStage":"-1643733803"},{"tagId":1072,"tagType":"subject","tagName":"六年级","nextStage":"1762259370"}],"id":"1773877388","showNext":"false","title":"小学","multiType":"radio"},"1864008760":{"subTags":[{"tagId":2054,"tagType":"subject","tagName":"寒春新课","nextStage":"-1"},{"tagId":1480,"tagType":"subject","tagName":"语文","nextStage":"-1"},{"tagId":1474,"tagType":"subject","tagName":"英语","nextStage":"-1"},{"tagId":1486,"tagType":"subject","tagName":"数学","nextStage":"-1"},{"tagId":1492,"tagType":"subject","tagName":"物理","nextStage":"-1"},{"tagId":1498,"tagType":"subject","tagName":"化学","nextStage":"-1"},{"tagId":1504,"tagType":"subject","tagName":"生物","nextStage":"-1"},{"tagId":1510,"tagType":"subject","tagName":"地理","nextStage":"-1"},{"tagId":1516,"tagType":"subject","tagName":"历史","nextStage":"-1"},{"tagId":1522,"tagType":"subject","tagName":"政治","nextStage":"-1"},{"tagId":1932,"tagType":"subject","tagName":"学霸访谈","nextStage":"-1"}],"id":"1864008760","showNext":true,"title":"高二科目","multiType":"radio"},"-1241354076":{"subTags":[{"tagId":1434,"tagType":"subject","tagName":"语文","nextStage":-1},{"tagId":1436,"tagType":"subject","tagName":"数学","nextStage":-1},{"tagId":1438,"tagType":"subject","tagName":"英语","nextStage":-1},{"tagId":1528,"tagType":"subject","tagName":"少儿编程","nextStage":-1},{"tagId":1928,"tagType":"subject","tagName":"家长频道","nextStage":-1}],"id":"-1241354076","showNext":true,"title":"小学四年级科目","multiType":"radio"},"1003657994":{"subTags":[{"tagId":1224,"tagType":"subject","tagName":"初一","nextStage":"1173426265"},{"tagId":1226,"tagType":"subject","tagName":"初二","nextStage":"1521900098"},{"tagId":1228,"tagType":"subject","tagName":"初三","nextStage":"386667459"}],"id":"1003657994","showNext":"false","title":"初中","multiType":"radio"},"-855824338":{"subTags":[{"tagId":2056,"tagType":"subject","tagName":"二轮新课","nextStage":"-1"},{"tagId":1482,"tagType":"subject","tagName":"语文","nextStage":"-1"},{"tagId":1488,"tagType":"subject","tagName":"数学","nextStage":"-1"},{"tagId":1476,"tagType":"subject","tagName":"英语","nextStage":"-1"},{"tagId":1494,"tagType":"subject","tagName":"物理","nextStage":"-1"},{"tagId":1500,"tagType":"subject","tagName":"化学","nextStage":"-1"},{"tagId":1506,"tagType":"subject","tagName":"生物","nextStage":"-1"},{"tagId":1518,"tagType":"subject","tagName":"历史","nextStage":"-1"},{"tagId":1512,"tagType":"subject","tagName":"地理","nextStage":"-1"},{"tagId":1524,"tagType":"subject","tagName":"政治","nextStage":"-1"},{"tagId":1932,"tagType":"subject","tagName":"学霸访谈","nextStage":"-1"},{"tagId":2012,"tagType":"sub_subject","tagName":"新大一","nextStage":"-1"}],"id":"-855824338","showNext":true,"title":"高三科目","multiType":"radio"},"-1267607113":{"subTags":[{"tagId":1422,"tagType":"subject","tagName":"语文","nextStage":-1},{"tagId":1424,"tagType":"subject","tagName":"数学","nextStage":-1},{"tagId":1426,"tagType":"subject","tagName":"英语","nextStage":-1},{"tagId":1528,"tagType":"subject","tagName":"少儿编程","nextStage":-1},{"tagId":2086,"tagType":"subject","tagName":"少儿美术","nextStage":-1},{"tagId":1928,"tagType":"subject","tagName":"家长频道","nextStage":-1}],"id":"-1267607113","showNext":true,"title":"小学二年级科目","multiType":"radio"},"-686187771":{"subTags":[{"tagId":2052,"tagType":"subject","tagName":"寒春新课","nextStage":"-1"},{"tagId":1478,"tagType":"subject","tagName":"语文","nextStage":"-1"},{"tagId":1472,"tagType":"subject","tagName":"英语","nextStage":"-1"},{"tagId":1484,"tagType":"subject","tagName":"数学","nextStage":"-1"},{"tagId":1490,"tagType":"subject","tagName":"物理","nextStage":"-1"},{"tagId":1496,"tagType":"subject","tagName":"化学","nextStage":"-1"},{"tagId":1502,"tagType":"subject","tagName":"生物","nextStage":"-1"},{"tagId":1508,"tagType":"subject","tagName":"地理","nextStage":"-1"},{"tagId":1514,"tagType":"subject","tagName":"历史","nextStage":"-1"},{"tagId":1932,"tagType":"subject","tagName":"学霸访谈","nextStage":"-1"}],"id":"-686187771","showNext":true,"title":"高一科目","multiType":"radio"}}
         * trigger : 0
         * startStage : 154271985
         */

        private StagesBean stages;
        private int trigger;
        private String startStage;

        public StagesBean getStages() {
            return stages;
        }

        public void setStages(StagesBean stages) {
            this.stages = stages;
        }

        public int getTrigger() {
            return trigger;
        }

        public void setTrigger(int trigger) {
            this.trigger = trigger;
        }

        public String getStartStage() {
            return startStage;
        }

        public void setStartStage(String startStage) {
            this.startStage = startStage;
        }

        public static class StagesBean {
            /**
             * -739657361 : {"subTags":[{"tagId":1416,"tagType":"subject","tagName":"语文","nextStage":-1},{"tagId":1418,"tagType":"subject","tagName":"数学","nextStage":-1},{"tagId":1420,"tagType":"subject","tagName":"英语","nextStage":-1},{"tagId":1528,"tagType":"subject","tagName":"少儿编程","nextStage":-1},{"tagId":2058,"tagType":"subject","tagName":"少儿美术","nextStage":-1},{"tagId":1928,"tagType":"subject","tagName":"家长频道","nextStage":-1}],"id":"-739657361","showNext":true,"title":"小学一年级科目","multiType":"radio"}
             * -842753927 : {"subTags":[{"tagId":926,"tagType":"subject","tagName":"高一","nextStage":"-686187771"},{"tagId":928,"tagType":"subject","tagName":"高二","nextStage":"1864008760"},{"tagId":930,"tagType":"subject","tagName":"高三","nextStage":"-855824338"}],"id":"-842753927","showNext":"false","title":"高中","multiType":"radio"}
             * -75911651 : {"subTags":[{"tagId":2366,"tagType":"subject","tagName":"卡搭编程","nextStage":-1},{"tagId":2368,"tagType":"subject","tagName":"有道乐读","nextStage":-1},{"tagId":2370,"tagType":"subject","tagName":"少儿美术","nextStage":-1}],"id":"-75911651","showNext":true,"title":"2-7岁","multiType":"radio"}
             * 1173426265 : {"subTags":[{"tagId":1452,"tagType":"subject","tagName":"语文","nextStage":"-1"},{"tagId":1454,"tagType":"subject","tagName":"数学","nextStage":"-1"},{"tagId":1456,"tagType":"subject","tagName":"英语","nextStage":"-1"},{"tagId":1936,"tagType":"subject","tagName":"物理","nextStage":"-1"},{"tagId":1930,"tagType":"subject","tagName":"家长频道","nextStage":"-1"}],"id":"1173426265","showNext":true,"title":"初一科目","multiType":"radio"}
             * 1762259370 : {"subTags":[{"tagId":1446,"tagType":"subject","tagName":"语文","nextStage":-1},{"tagId":1448,"tagType":"subject","tagName":"数学","nextStage":-1},{"tagId":1450,"tagType":"subject","tagName":"英语","nextStage":-1},{"tagId":1874,"tagType":"subject","tagName":"新初一","nextStage":-1},{"tagId":1528,"tagType":"subject","tagName":"少儿编程","nextStage":-1},{"tagId":1928,"tagType":"subject","tagName":"家长频道","nextStage":-1}],"id":"1762259370","showNext":true,"title":"小学六年级科目","multiType":"radio"}
             * 1099221270 : {"subTags":[{"tagId":1428,"tagType":"subject","tagName":"语文","nextStage":-1},{"tagId":1430,"tagType":"subject","tagName":"数学","nextStage":-1},{"tagId":1432,"tagType":"subject","tagName":"英语","nextStage":-1},{"tagId":1528,"tagType":"subject","tagName":"少儿编程","nextStage":-1},{"tagId":1928,"tagType":"subject","tagName":"家长频道","nextStage":-1}],"id":"1099221270","showNext":true,"title":"小学三年级科目","multiType":"radio"}
             * -583494580 : {"subTags":[{"tagId":1400,"tagType":"subject","tagName":"研一","nextStage":"-11770465"},{"tagId":1402,"tagType":"subject","tagName":"研二等","nextStage":"-11770465"}],"id":"-583494580","showNext":true,"title":"研究生","multiType":"radio"}
             * -382633109 : {"subTags":[{"tagId":2364,"tagType":"subject","tagName":"2-7岁","nextStage":"-75911651"}],"id":"-382633109","showNext":false,"title":"学前","multiType":"radio"}
             * 154271985 : {"subTags":[{"tagId":1276,"tagType":"subject","tagName":"学前","nextStage":"-382633109"},{"tagId":430,"tagType":"group","tagName":"小学","nextStage":"1773877388"},{"tagId":432,"tagType":"group","tagName":"初中","nextStage":"1003657994"},{"tagId":410,"tagType":"group","tagName":"高中","nextStage":"-842753927"},{"tagId":908,"tagName":"大学","nextStage":"-340228195"},{"tagId":1386,"tagType":"group","tagName":"其他","nextStage":"1832454640"}],"id":"154271985","showNext":true,"title":"您所处的阶段是","multiType":"radio"}
             * -340228195 : {"subTags":[{"tagId":1392,"tagType":"subject","tagName":"大一","nextStage":"-1293367281"},{"tagId":1394,"tagType":"subject","tagName":"大二","nextStage":"-590253001"},{"tagId":1396,"tagType":"subject","tagName":"大三","nextStage":"65414353"},{"tagId":1398,"tagType":"subject","tagName":"大四","nextStage":"-11770465"},{"tagId":1384,"tagType":"group","tagName":"研究生","nextStage":"-11770465"}],"id":"-340228195","showNext":"true","title":"本科","multiType":"radio"}
             * -590253001 : {"subTags":[{"tagId":870,"tagType":"subject","tagName":"四六级","nextStage":-1},{"tagId":414,"tagType":"subject","tagName":"英语提升","nextStage":-1},{"tagId":424,"tagType":"subject","tagName":"考研","nextStage":-1},{"tagId":1110,"tagType":"subject","tagName":"兴趣技能","nextStage":-1},{"tagId":828,"tagType":"subject","tagName":"逻辑英语","nextStage":-1},{"tagId":418,"tagType":"subject","tagName":"小语种","nextStage":-1},{"tagId":572,"tagType":"subject","tagName":"雅思托福","nextStage":-1},{"tagId":896,"tagType":"subject","tagName":"专四专八","nextStage":-1},{"tagId":458,"tagType":"subject","tagName":"教师资格","nextStage":-1},{"tagId":1542,"tagType":"subject","tagName":"职业考证","nextStage":-1},{"tagId":1078,"tagType":"subject","tagName":"编程开发","nextStage":-1}],"id":"-590253001","showNext":"false","title":"大二兴趣","multiType":"checkbox","nextStage":-1}
             * -1643733803 : {"subTags":[{"tagId":1440,"tagType":"subject","tagName":"语文","nextStage":-1},{"tagId":1442,"tagType":"subject","tagName":"数学","nextStage":-1},{"tagId":1444,"tagType":"subject","tagName":"英语","nextStage":-1},{"tagId":1528,"tagType":"subject","tagName":"少儿编程","nextStage":-1},{"tagId":1928,"tagType":"subject","tagName":"家长频道","nextStage":-1}],"id":"-1643733803","showNext":true,"title":"小学五年级科目","multiType":"radio"}
             * -11770465 : {"subTags":[{"tagId":414,"tagType":"subject","tagName":"英语提升","nextStage":-1},{"tagId":870,"tagType":"subject","tagName":"四六级","nextStage":-1},{"tagId":424,"tagType":"subject","tagName":"考研","nextStage":-1},{"tagId":1110,"tagType":"subject","tagName":"兴趣技能","nextStage":-1},{"tagId":828,"tagType":"subject","tagName":"逻辑英语","nextStage":-1},{"tagId":418,"tagType":"subject","tagName":"小语种","nextStage":-1},{"tagId":572,"tagType":"subject","tagName":"雅思托福","nextStage":-1},{"tagId":896,"tagType":"subject","tagName":"专四专八","nextStage":-1},{"tagId":458,"tagType":"subject","tagName":"教师资格","nextStage":-1},{"tagId":1542,"tagType":"subject","tagName":"职业考证","nextStage":-1},{"tagId":1078,"tagType":"subject","tagName":"编程开发","nextStage":-1}],"id":"-11770465","showNext":"false","title":"兴趣选项","multiType":"checkbox","nextStage":-1}
             * 1832454640 : {"subTags":[{"tagId":1404,"tagType":"subject","tagName":"上班族","nextStage":"-11770465"},{"tagId":1406,"tagType":"subject","tagName":"求职者","nextStage":"-11770465"},{"tagId":1408,"tagType":"subject","tagName":"自由派","nextStage":"-11770465"}],"id":"1832454640","showNext":true,"title":"其他","multiType":"radio"}
             * 1521900098 : {"subTags":[{"tagId":1458,"tagType":"subject","tagName":"语文","nextStage":"-1"},{"tagId":1460,"tagType":"subject","tagName":"数学","nextStage":"-1"},{"tagId":1462,"tagType":"subject","tagName":"英语","nextStage":"-1"},{"tagId":1538,"tagType":"subject","tagName":"物理","nextStage":"-1"},{"tagId":2360,"tagType":"subject","tagName":"化学","nextStage":"-1"},{"tagId":2446,"tagType":"subject","tagName":"生物","nextStage":"-1"},{"tagId":1930,"tagType":"subject","tagName":"家长频道","nextStage":"-1"}],"id":"1521900098","showNext":true,"title":"初二科目","multiType":"radio"}
             * 386667459 : {"subTags":[{"tagId":1464,"tagType":"subject","tagName":"语文","nextStage":"-1"},{"tagId":1466,"tagType":"subject","tagName":"数学","nextStage":"-1"},{"tagId":1468,"tagType":"subject","tagName":"英语","nextStage":"-1"},{"tagId":1534,"tagType":"subject","tagName":"物理","nextStage":"-1"},{"tagId":1536,"tagType":"subject","tagName":"化学","nextStage":"-1"},{"tagId":2448,"tagType":"subject","tagName":"生物","nextStage":"-1"},{"tagId":1930,"tagType":"subject","tagName":"家长频道","nextStage":"-1"}],"id":"386667459","showNext":false,"title":"初三科目","multiType":"radio"}
             * -1293367281 : {"subTags":[{"tagId":414,"tagType":"subject","tagName":"英语提升","nextStage":-1},{"tagId":870,"tagType":"subject","tagName":"四六级","nextStage":-1},{"tagId":424,"tagType":"subject","tagName":"考研","nextStage":-1},{"tagId":1110,"tagType":"subject","tagName":"兴趣技能","nextStage":-1},{"tagId":828,"tagType":"subject","tagName":"逻辑英语","nextStage":-1},{"tagId":418,"tagType":"subject","tagName":"小语种","nextStage":-1},{"tagId":572,"tagType":"subject","tagName":"雅思托福","nextStage":-1},{"tagId":896,"tagType":"subject","tagName":"专四专八","nextStage":-1},{"tagId":458,"tagType":"subject","tagName":"教师资格","nextStage":-1},{"tagId":1542,"tagType":"subject","tagName":"职业考证","nextStage":-1},{"tagId":1078,"tagType":"subject","tagName":"编程开发","nextStage":-1}],"id":"-1293367281","showNext":"false","title":"大一兴趣","multiType":"checkbox","nextStage":-1}
             * 65414353 : {"subTags":[{"tagId":424,"tagType":"subject","tagName":"考研","nextStage":-1},{"tagId":870,"tagType":"subject","tagName":"四六级","nextStage":-1},{"tagId":414,"tagType":"subject","tagName":"英语提升","nextStage":-1},{"tagId":1110,"tagType":"subject","tagName":"兴趣技能","nextStage":-1},{"tagId":828,"tagType":"subject","tagName":"逻辑英语","nextStage":-1},{"tagId":418,"tagType":"subject","tagName":"小语种","nextStage":-1},{"tagId":572,"tagType":"subject","tagName":"雅思托福","nextStage":-1},{"tagId":896,"tagType":"subject","tagName":"专四专八","nextStage":-1},{"tagId":458,"tagType":"subject","tagName":"教师资格","nextStage":-1},{"tagId":1542,"tagType":"subject","tagName":"职业考证","nextStage":-1},{"tagId":1078,"tagType":"subject","tagName":"编程开发","nextStage":-1}],"id":"65414353","showNext":"false","title":"大三兴趣","multiType":"checkbox","nextStage":-1}
             * 1773877388 : {"subTags":[{"tagId":1062,"tagType":"subject","tagName":"一年级","nextStage":"-739657361"},{"tagId":1064,"tagType":"subject","tagName":"二年级","nextStage":"-1267607113"},{"tagId":1066,"tagType":"subject","tagName":"三年级","nextStage":"1099221270"},{"tagId":1068,"tagType":"subject","tagName":"四年级","nextStage":"-1241354076"},{"tagId":1070,"tagType":"subject","tagName":"五年级","nextStage":"-1643733803"},{"tagId":1072,"tagType":"subject","tagName":"六年级","nextStage":"1762259370"}],"id":"1773877388","showNext":"false","title":"小学","multiType":"radio"}
             * 1864008760 : {"subTags":[{"tagId":2054,"tagType":"subject","tagName":"寒春新课","nextStage":"-1"},{"tagId":1480,"tagType":"subject","tagName":"语文","nextStage":"-1"},{"tagId":1474,"tagType":"subject","tagName":"英语","nextStage":"-1"},{"tagId":1486,"tagType":"subject","tagName":"数学","nextStage":"-1"},{"tagId":1492,"tagType":"subject","tagName":"物理","nextStage":"-1"},{"tagId":1498,"tagType":"subject","tagName":"化学","nextStage":"-1"},{"tagId":1504,"tagType":"subject","tagName":"生物","nextStage":"-1"},{"tagId":1510,"tagType":"subject","tagName":"地理","nextStage":"-1"},{"tagId":1516,"tagType":"subject","tagName":"历史","nextStage":"-1"},{"tagId":1522,"tagType":"subject","tagName":"政治","nextStage":"-1"},{"tagId":1932,"tagType":"subject","tagName":"学霸访谈","nextStage":"-1"}],"id":"1864008760","showNext":true,"title":"高二科目","multiType":"radio"}
             * -1241354076 : {"subTags":[{"tagId":1434,"tagType":"subject","tagName":"语文","nextStage":-1},{"tagId":1436,"tagType":"subject","tagName":"数学","nextStage":-1},{"tagId":1438,"tagType":"subject","tagName":"英语","nextStage":-1},{"tagId":1528,"tagType":"subject","tagName":"少儿编程","nextStage":-1},{"tagId":1928,"tagType":"subject","tagName":"家长频道","nextStage":-1}],"id":"-1241354076","showNext":true,"title":"小学四年级科目","multiType":"radio"}
             * 1003657994 : {"subTags":[{"tagId":1224,"tagType":"subject","tagName":"初一","nextStage":"1173426265"},{"tagId":1226,"tagType":"subject","tagName":"初二","nextStage":"1521900098"},{"tagId":1228,"tagType":"subject","tagName":"初三","nextStage":"386667459"}],"id":"1003657994","showNext":"false","title":"初中","multiType":"radio"}
             * -855824338 : {"subTags":[{"tagId":2056,"tagType":"subject","tagName":"二轮新课","nextStage":"-1"},{"tagId":1482,"tagType":"subject","tagName":"语文","nextStage":"-1"},{"tagId":1488,"tagType":"subject","tagName":"数学","nextStage":"-1"},{"tagId":1476,"tagType":"subject","tagName":"英语","nextStage":"-1"},{"tagId":1494,"tagType":"subject","tagName":"物理","nextStage":"-1"},{"tagId":1500,"tagType":"subject","tagName":"化学","nextStage":"-1"},{"tagId":1506,"tagType":"subject","tagName":"生物","nextStage":"-1"},{"tagId":1518,"tagType":"subject","tagName":"历史","nextStage":"-1"},{"tagId":1512,"tagType":"subject","tagName":"地理","nextStage":"-1"},{"tagId":1524,"tagType":"subject","tagName":"政治","nextStage":"-1"},{"tagId":1932,"tagType":"subject","tagName":"学霸访谈","nextStage":"-1"},{"tagId":2012,"tagType":"sub_subject","tagName":"新大一","nextStage":"-1"}],"id":"-855824338","showNext":true,"title":"高三科目","multiType":"radio"}
             * -1267607113 : {"subTags":[{"tagId":1422,"tagType":"subject","tagName":"语文","nextStage":-1},{"tagId":1424,"tagType":"subject","tagName":"数学","nextStage":-1},{"tagId":1426,"tagType":"subject","tagName":"英语","nextStage":-1},{"tagId":1528,"tagType":"subject","tagName":"少儿编程","nextStage":-1},{"tagId":2086,"tagType":"subject","tagName":"少儿美术","nextStage":-1},{"tagId":1928,"tagType":"subject","tagName":"家长频道","nextStage":-1}],"id":"-1267607113","showNext":true,"title":"小学二年级科目","multiType":"radio"}
             * -686187771 : {"subTags":[{"tagId":2052,"tagType":"subject","tagName":"寒春新课","nextStage":"-1"},{"tagId":1478,"tagType":"subject","tagName":"语文","nextStage":"-1"},{"tagId":1472,"tagType":"subject","tagName":"英语","nextStage":"-1"},{"tagId":1484,"tagType":"subject","tagName":"数学","nextStage":"-1"},{"tagId":1490,"tagType":"subject","tagName":"物理","nextStage":"-1"},{"tagId":1496,"tagType":"subject","tagName":"化学","nextStage":"-1"},{"tagId":1502,"tagType":"subject","tagName":"生物","nextStage":"-1"},{"tagId":1508,"tagType":"subject","tagName":"地理","nextStage":"-1"},{"tagId":1514,"tagType":"subject","tagName":"历史","nextStage":"-1"},{"tagId":1932,"tagType":"subject","tagName":"学霸访谈","nextStage":"-1"}],"id":"-686187771","showNext":true,"title":"高一科目","multiType":"radio"}
             */

            @SerializedName("-739657361")
            private _$739657361Bean _$739657361;
            @SerializedName("-842753927")
            private _$842753927Bean _$842753927;
            @SerializedName("-75911651")
            private _$75911651Bean _$75911651;
            @SerializedName("1173426265")
            private _$1173426265Bean _$1173426265;
            @SerializedName("1762259370")
            private _$1762259370Bean _$1762259370;
            @SerializedName("1099221270")
            private _$1099221270Bean _$1099221270;
            @SerializedName("-583494580")
            private _$583494580Bean _$583494580;
            @SerializedName("-382633109")
            private _$382633109Bean _$382633109;
            @SerializedName("154271985")
            private _$154271985Bean _$154271985;
            @SerializedName("-340228195")
            private _$340228195Bean _$340228195;
            @SerializedName("-590253001")
            private _$590253001Bean _$590253001;
            @SerializedName("-1643733803")
            private _$1643733803Bean _$1643733803;
            @SerializedName("-11770465")
            private _$11770465Bean _$11770465;
            @SerializedName("1832454640")
            private _$1832454640Bean _$1832454640;
            @SerializedName("1521900098")
            private _$1521900098Bean _$1521900098;
            @SerializedName("386667459")
            private _$386667459Bean _$386667459;
            @SerializedName("-1293367281")
            private _$1293367281Bean _$1293367281;
            @SerializedName("65414353")
            private _$65414353Bean _$65414353;
            @SerializedName("1773877388")
            private _$1773877388Bean _$1773877388;
            @SerializedName("1864008760")
            private _$1864008760Bean _$1864008760;
            @SerializedName("-1241354076")
            private _$1241354076Bean _$1241354076;
            @SerializedName("1003657994")
            private _$1003657994Bean _$1003657994;
            @SerializedName("-855824338")
            private _$855824338Bean _$855824338;
            @SerializedName("-1267607113")
            private _$1267607113Bean _$1267607113;
            @SerializedName("-686187771")
            private _$686187771Bean _$686187771;

            public _$739657361Bean get_$739657361() {
                return _$739657361;
            }

            public void set_$739657361(_$739657361Bean _$739657361) {
                this._$739657361 = _$739657361;
            }

            public _$842753927Bean get_$842753927() {
                return _$842753927;
            }

            public void set_$842753927(_$842753927Bean _$842753927) {
                this._$842753927 = _$842753927;
            }

            public _$75911651Bean get_$75911651() {
                return _$75911651;
            }

            public void set_$75911651(_$75911651Bean _$75911651) {
                this._$75911651 = _$75911651;
            }

            public _$1173426265Bean get_$1173426265() {
                return _$1173426265;
            }

            public void set_$1173426265(_$1173426265Bean _$1173426265) {
                this._$1173426265 = _$1173426265;
            }

            public _$1762259370Bean get_$1762259370() {
                return _$1762259370;
            }

            public void set_$1762259370(_$1762259370Bean _$1762259370) {
                this._$1762259370 = _$1762259370;
            }

            public _$1099221270Bean get_$1099221270() {
                return _$1099221270;
            }

            public void set_$1099221270(_$1099221270Bean _$1099221270) {
                this._$1099221270 = _$1099221270;
            }

            public _$583494580Bean get_$583494580() {
                return _$583494580;
            }

            public void set_$583494580(_$583494580Bean _$583494580) {
                this._$583494580 = _$583494580;
            }

            public _$382633109Bean get_$382633109() {
                return _$382633109;
            }

            public void set_$382633109(_$382633109Bean _$382633109) {
                this._$382633109 = _$382633109;
            }

            public _$154271985Bean get_$154271985() {
                return _$154271985;
            }

            public void set_$154271985(_$154271985Bean _$154271985) {
                this._$154271985 = _$154271985;
            }

            public _$340228195Bean get_$340228195() {
                return _$340228195;
            }

            public void set_$340228195(_$340228195Bean _$340228195) {
                this._$340228195 = _$340228195;
            }

            public _$590253001Bean get_$590253001() {
                return _$590253001;
            }

            public void set_$590253001(_$590253001Bean _$590253001) {
                this._$590253001 = _$590253001;
            }

            public _$1643733803Bean get_$1643733803() {
                return _$1643733803;
            }

            public void set_$1643733803(_$1643733803Bean _$1643733803) {
                this._$1643733803 = _$1643733803;
            }

            public _$11770465Bean get_$11770465() {
                return _$11770465;
            }

            public void set_$11770465(_$11770465Bean _$11770465) {
                this._$11770465 = _$11770465;
            }

            public _$1832454640Bean get_$1832454640() {
                return _$1832454640;
            }

            public void set_$1832454640(_$1832454640Bean _$1832454640) {
                this._$1832454640 = _$1832454640;
            }

            public _$1521900098Bean get_$1521900098() {
                return _$1521900098;
            }

            public void set_$1521900098(_$1521900098Bean _$1521900098) {
                this._$1521900098 = _$1521900098;
            }

            public _$386667459Bean get_$386667459() {
                return _$386667459;
            }

            public void set_$386667459(_$386667459Bean _$386667459) {
                this._$386667459 = _$386667459;
            }

            public _$1293367281Bean get_$1293367281() {
                return _$1293367281;
            }

            public void set_$1293367281(_$1293367281Bean _$1293367281) {
                this._$1293367281 = _$1293367281;
            }

            public _$65414353Bean get_$65414353() {
                return _$65414353;
            }

            public void set_$65414353(_$65414353Bean _$65414353) {
                this._$65414353 = _$65414353;
            }

            public _$1773877388Bean get_$1773877388() {
                return _$1773877388;
            }

            public void set_$1773877388(_$1773877388Bean _$1773877388) {
                this._$1773877388 = _$1773877388;
            }

            public _$1864008760Bean get_$1864008760() {
                return _$1864008760;
            }

            public void set_$1864008760(_$1864008760Bean _$1864008760) {
                this._$1864008760 = _$1864008760;
            }

            public _$1241354076Bean get_$1241354076() {
                return _$1241354076;
            }

            public void set_$1241354076(_$1241354076Bean _$1241354076) {
                this._$1241354076 = _$1241354076;
            }

            public _$1003657994Bean get_$1003657994() {
                return _$1003657994;
            }

            public void set_$1003657994(_$1003657994Bean _$1003657994) {
                this._$1003657994 = _$1003657994;
            }

            public _$855824338Bean get_$855824338() {
                return _$855824338;
            }

            public void set_$855824338(_$855824338Bean _$855824338) {
                this._$855824338 = _$855824338;
            }

            public _$1267607113Bean get_$1267607113() {
                return _$1267607113;
            }

            public void set_$1267607113(_$1267607113Bean _$1267607113) {
                this._$1267607113 = _$1267607113;
            }

            public _$686187771Bean get_$686187771() {
                return _$686187771;
            }

            public void set_$686187771(_$686187771Bean _$686187771) {
                this._$686187771 = _$686187771;
            }

            public static class _$739657361Bean {
                /**
                 * subTags : [{"tagId":1416,"tagType":"subject","tagName":"语文","nextStage":-1},{"tagId":1418,"tagType":"subject","tagName":"数学","nextStage":-1},{"tagId":1420,"tagType":"subject","tagName":"英语","nextStage":-1},{"tagId":1528,"tagType":"subject","tagName":"少儿编程","nextStage":-1},{"tagId":2058,"tagType":"subject","tagName":"少儿美术","nextStage":-1},{"tagId":1928,"tagType":"subject","tagName":"家长频道","nextStage":-1}]
                 * id : -739657361
                 * showNext : true
                 * title : 小学一年级科目
                 * multiType : radio
                 */

                private String id;
                private boolean showNext;
                private String title;
                private String multiType;
                private List<SubTagsBean> subTags;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public boolean isShowNext() {
                    return showNext;
                }

                public void setShowNext(boolean showNext) {
                    this.showNext = showNext;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getMultiType() {
                    return multiType;
                }

                public void setMultiType(String multiType) {
                    this.multiType = multiType;
                }

                public List<SubTagsBean> getSubTags() {
                    return subTags;
                }

                public void setSubTags(List<SubTagsBean> subTags) {
                    this.subTags = subTags;
                }

            }

            public static class _$842753927Bean {
                /**
                 * subTags : [{"tagId":926,"tagType":"subject","tagName":"高一","nextStage":"-686187771"},{"tagId":928,"tagType":"subject","tagName":"高二","nextStage":"1864008760"},{"tagId":930,"tagType":"subject","tagName":"高三","nextStage":"-855824338"}]
                 * id : -842753927
                 * showNext : false
                 * title : 高中
                 * multiType : radio
                 */

                private String id;
                private String showNext;
                private String title;
                private String multiType;
                private List<SubTagsBean> subTags;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getShowNext() {
                    return showNext;
                }

                public void setShowNext(String showNext) {
                    this.showNext = showNext;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getMultiType() {
                    return multiType;
                }

                public void setMultiType(String multiType) {
                    this.multiType = multiType;
                }

                public List<SubTagsBean> getSubTags() {
                    return subTags;
                }

                public void setSubTags(List<SubTagsBean> subTags) {
                    this.subTags = subTags;
                }

            }

            public static class _$75911651Bean {
                /**
                 * subTags : [{"tagId":2366,"tagType":"subject","tagName":"卡搭编程","nextStage":-1},{"tagId":2368,"tagType":"subject","tagName":"有道乐读","nextStage":-1},{"tagId":2370,"tagType":"subject","tagName":"少儿美术","nextStage":-1}]
                 * id : -75911651
                 * showNext : true
                 * title : 2-7岁
                 * multiType : radio
                 */

                private String id;
                private boolean showNext;
                private String title;
                private String multiType;
                private List<SubTagsBean> subTags;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public boolean isShowNext() {
                    return showNext;
                }

                public void setShowNext(boolean showNext) {
                    this.showNext = showNext;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getMultiType() {
                    return multiType;
                }

                public void setMultiType(String multiType) {
                    this.multiType = multiType;
                }

                public List<SubTagsBean> getSubTags() {
                    return subTags;
                }

                public void setSubTags(List<SubTagsBean> subTags) {
                    this.subTags = subTags;
                }

            }

            public static class _$1173426265Bean {
                /**
                 * subTags : [{"tagId":1452,"tagType":"subject","tagName":"语文","nextStage":"-1"},{"tagId":1454,"tagType":"subject","tagName":"数学","nextStage":"-1"},{"tagId":1456,"tagType":"subject","tagName":"英语","nextStage":"-1"},{"tagId":1936,"tagType":"subject","tagName":"物理","nextStage":"-1"},{"tagId":1930,"tagType":"subject","tagName":"家长频道","nextStage":"-1"}]
                 * id : 1173426265
                 * showNext : true
                 * title : 初一科目
                 * multiType : radio
                 */

                private String id;
                private boolean showNext;
                private String title;
                private String multiType;
                private List<SubTagsBean> subTags;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public boolean isShowNext() {
                    return showNext;
                }

                public void setShowNext(boolean showNext) {
                    this.showNext = showNext;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getMultiType() {
                    return multiType;
                }

                public void setMultiType(String multiType) {
                    this.multiType = multiType;
                }

                public List<SubTagsBean> getSubTags() {
                    return subTags;
                }

                public void setSubTags(List<SubTagsBean> subTags) {
                    this.subTags = subTags;
                }

            }

            public static class _$1762259370Bean {
                /**
                 * subTags : [{"tagId":1446,"tagType":"subject","tagName":"语文","nextStage":-1},{"tagId":1448,"tagType":"subject","tagName":"数学","nextStage":-1},{"tagId":1450,"tagType":"subject","tagName":"英语","nextStage":-1},{"tagId":1874,"tagType":"subject","tagName":"新初一","nextStage":-1},{"tagId":1528,"tagType":"subject","tagName":"少儿编程","nextStage":-1},{"tagId":1928,"tagType":"subject","tagName":"家长频道","nextStage":-1}]
                 * id : 1762259370
                 * showNext : true
                 * title : 小学六年级科目
                 * multiType : radio
                 */

                private String id;
                private boolean showNext;
                private String title;
                private String multiType;
                private List<SubTagsBean> subTags;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public boolean isShowNext() {
                    return showNext;
                }

                public void setShowNext(boolean showNext) {
                    this.showNext = showNext;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getMultiType() {
                    return multiType;
                }

                public void setMultiType(String multiType) {
                    this.multiType = multiType;
                }

                public List<SubTagsBean> getSubTags() {
                    return subTags;
                }

                public void setSubTags(List<SubTagsBean> subTags) {
                    this.subTags = subTags;
                }

            }

            public static class _$1099221270Bean {
                /**
                 * subTags : [{"tagId":1428,"tagType":"subject","tagName":"语文","nextStage":-1},{"tagId":1430,"tagType":"subject","tagName":"数学","nextStage":-1},{"tagId":1432,"tagType":"subject","tagName":"英语","nextStage":-1},{"tagId":1528,"tagType":"subject","tagName":"少儿编程","nextStage":-1},{"tagId":1928,"tagType":"subject","tagName":"家长频道","nextStage":-1}]
                 * id : 1099221270
                 * showNext : true
                 * title : 小学三年级科目
                 * multiType : radio
                 */

                private String id;
                private boolean showNext;
                private String title;
                private String multiType;
                private List<SubTagsBean> subTags;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public boolean isShowNext() {
                    return showNext;
                }

                public void setShowNext(boolean showNext) {
                    this.showNext = showNext;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getMultiType() {
                    return multiType;
                }

                public void setMultiType(String multiType) {
                    this.multiType = multiType;
                }

                public List<SubTagsBean> getSubTags() {
                    return subTags;
                }

                public void setSubTags(List<SubTagsBean> subTags) {
                    this.subTags = subTags;
                }

            }

            public static class _$583494580Bean {
                /**
                 * subTags : [{"tagId":1400,"tagType":"subject","tagName":"研一","nextStage":"-11770465"},{"tagId":1402,"tagType":"subject","tagName":"研二等","nextStage":"-11770465"}]
                 * id : -583494580
                 * showNext : true
                 * title : 研究生
                 * multiType : radio
                 */

                private String id;
                private boolean showNext;
                private String title;
                private String multiType;
                private List<SubTagsBean> subTags;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public boolean isShowNext() {
                    return showNext;
                }

                public void setShowNext(boolean showNext) {
                    this.showNext = showNext;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getMultiType() {
                    return multiType;
                }

                public void setMultiType(String multiType) {
                    this.multiType = multiType;
                }

                public List<SubTagsBean> getSubTags() {
                    return subTags;
                }

                public void setSubTags(List<SubTagsBean> subTags) {
                    this.subTags = subTags;
                }

            }

            public static class _$382633109Bean {
                /**
                 * subTags : [{"tagId":2364,"tagType":"subject","tagName":"2-7岁","nextStage":"-75911651"}]
                 * id : -382633109
                 * showNext : false
                 * title : 学前
                 * multiType : radio
                 */

                private String id;
                private boolean showNext;
                private String title;
                private String multiType;
                private List<SubTagsBean> subTags;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public boolean isShowNext() {
                    return showNext;
                }

                public void setShowNext(boolean showNext) {
                    this.showNext = showNext;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getMultiType() {
                    return multiType;
                }

                public void setMultiType(String multiType) {
                    this.multiType = multiType;
                }

                public List<SubTagsBean> getSubTags() {
                    return subTags;
                }

                public void setSubTags(List<SubTagsBean> subTags) {
                    this.subTags = subTags;
                }

            }

            public static class _$154271985Bean {
                /**
                 * subTags : [{"tagId":1276,"tagType":"subject","tagName":"学前","nextStage":"-382633109"},{"tagId":430,"tagType":"group","tagName":"小学","nextStage":"1773877388"},{"tagId":432,"tagType":"group","tagName":"初中","nextStage":"1003657994"},{"tagId":410,"tagType":"group","tagName":"高中","nextStage":"-842753927"},{"tagId":908,"tagName":"大学","nextStage":"-340228195"},{"tagId":1386,"tagType":"group","tagName":"其他","nextStage":"1832454640"}]
                 * id : 154271985
                 * showNext : true
                 * title : 您所处的阶段是
                 * multiType : radio
                 */

                private String id;
                private boolean showNext;
                private String title;
                private String multiType;
                private List<SubTagsBean> subTags;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public boolean isShowNext() {
                    return showNext;
                }

                public void setShowNext(boolean showNext) {
                    this.showNext = showNext;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getMultiType() {
                    return multiType;
                }

                public void setMultiType(String multiType) {
                    this.multiType = multiType;
                }

                public List<SubTagsBean> getSubTags() {
                    return subTags;
                }

                public void setSubTags(List<SubTagsBean> subTags) {
                    this.subTags = subTags;
                }

            }

            public static class _$340228195Bean {
                /**
                 * subTags : [{"tagId":1392,"tagType":"subject","tagName":"大一","nextStage":"-1293367281"},{"tagId":1394,"tagType":"subject","tagName":"大二","nextStage":"-590253001"},{"tagId":1396,"tagType":"subject","tagName":"大三","nextStage":"65414353"},{"tagId":1398,"tagType":"subject","tagName":"大四","nextStage":"-11770465"},{"tagId":1384,"tagType":"group","tagName":"研究生","nextStage":"-11770465"}]
                 * id : -340228195
                 * showNext : true
                 * title : 本科
                 * multiType : radio
                 */

                private String id;
                private String showNext;
                private String title;
                private String multiType;
                private List<SubTagsBean> subTags;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getShowNext() {
                    return showNext;
                }

                public void setShowNext(String showNext) {
                    this.showNext = showNext;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getMultiType() {
                    return multiType;
                }

                public void setMultiType(String multiType) {
                    this.multiType = multiType;
                }

                public List<SubTagsBean> getSubTags() {
                    return subTags;
                }

                public void setSubTags(List<SubTagsBean> subTags) {
                    this.subTags = subTags;
                }

            }

            public static class _$590253001Bean {
                /**
                 * subTags : [{"tagId":870,"tagType":"subject","tagName":"四六级","nextStage":-1},{"tagId":414,"tagType":"subject","tagName":"英语提升","nextStage":-1},{"tagId":424,"tagType":"subject","tagName":"考研","nextStage":-1},{"tagId":1110,"tagType":"subject","tagName":"兴趣技能","nextStage":-1},{"tagId":828,"tagType":"subject","tagName":"逻辑英语","nextStage":-1},{"tagId":418,"tagType":"subject","tagName":"小语种","nextStage":-1},{"tagId":572,"tagType":"subject","tagName":"雅思托福","nextStage":-1},{"tagId":896,"tagType":"subject","tagName":"专四专八","nextStage":-1},{"tagId":458,"tagType":"subject","tagName":"教师资格","nextStage":-1},{"tagId":1542,"tagType":"subject","tagName":"职业考证","nextStage":-1},{"tagId":1078,"tagType":"subject","tagName":"编程开发","nextStage":-1}]
                 * id : -590253001
                 * showNext : false
                 * title : 大二兴趣
                 * multiType : checkbox
                 * nextStage : -1
                 */

                private String id;
                private String showNext;
                private String title;
                private String multiType;
                private int nextStage;
                private List<SubTagsBean> subTags;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getShowNext() {
                    return showNext;
                }

                public void setShowNext(String showNext) {
                    this.showNext = showNext;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getMultiType() {
                    return multiType;
                }

                public void setMultiType(String multiType) {
                    this.multiType = multiType;
                }

                public int getNextStage() {
                    return nextStage;
                }

                public void setNextStage(int nextStage) {
                    this.nextStage = nextStage;
                }

                public List<SubTagsBean> getSubTags() {
                    return subTags;
                }

                public void setSubTags(List<SubTagsBean> subTags) {
                    this.subTags = subTags;
                }

            }

            public static class _$1643733803Bean {
                /**
                 * subTags : [{"tagId":1440,"tagType":"subject","tagName":"语文","nextStage":-1},{"tagId":1442,"tagType":"subject","tagName":"数学","nextStage":-1},{"tagId":1444,"tagType":"subject","tagName":"英语","nextStage":-1},{"tagId":1528,"tagType":"subject","tagName":"少儿编程","nextStage":-1},{"tagId":1928,"tagType":"subject","tagName":"家长频道","nextStage":-1}]
                 * id : -1643733803
                 * showNext : true
                 * title : 小学五年级科目
                 * multiType : radio
                 */

                private String id;
                private boolean showNext;
                private String title;
                private String multiType;
                private List<SubTagsBean> subTags;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public boolean isShowNext() {
                    return showNext;
                }

                public void setShowNext(boolean showNext) {
                    this.showNext = showNext;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getMultiType() {
                    return multiType;
                }

                public void setMultiType(String multiType) {
                    this.multiType = multiType;
                }

                public List<SubTagsBean> getSubTags() {
                    return subTags;
                }

                public void setSubTags(List<SubTagsBean> subTags) {
                    this.subTags = subTags;
                }

            }

            public static class _$11770465Bean {
                /**
                 * subTags : [{"tagId":414,"tagType":"subject","tagName":"英语提升","nextStage":-1},{"tagId":870,"tagType":"subject","tagName":"四六级","nextStage":-1},{"tagId":424,"tagType":"subject","tagName":"考研","nextStage":-1},{"tagId":1110,"tagType":"subject","tagName":"兴趣技能","nextStage":-1},{"tagId":828,"tagType":"subject","tagName":"逻辑英语","nextStage":-1},{"tagId":418,"tagType":"subject","tagName":"小语种","nextStage":-1},{"tagId":572,"tagType":"subject","tagName":"雅思托福","nextStage":-1},{"tagId":896,"tagType":"subject","tagName":"专四专八","nextStage":-1},{"tagId":458,"tagType":"subject","tagName":"教师资格","nextStage":-1},{"tagId":1542,"tagType":"subject","tagName":"职业考证","nextStage":-1},{"tagId":1078,"tagType":"subject","tagName":"编程开发","nextStage":-1}]
                 * id : -11770465
                 * showNext : false
                 * title : 兴趣选项
                 * multiType : checkbox
                 * nextStage : -1
                 */

                private String id;
                private String showNext;
                private String title;
                private String multiType;
                private int nextStage;
                private List<SubTagsBean> subTags;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getShowNext() {
                    return showNext;
                }

                public void setShowNext(String showNext) {
                    this.showNext = showNext;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getMultiType() {
                    return multiType;
                }

                public void setMultiType(String multiType) {
                    this.multiType = multiType;
                }

                public int getNextStage() {
                    return nextStage;
                }

                public void setNextStage(int nextStage) {
                    this.nextStage = nextStage;
                }

                public List<SubTagsBean> getSubTags() {
                    return subTags;
                }

                public void setSubTags(List<SubTagsBean> subTags) {
                    this.subTags = subTags;
                }

            }

            public static class _$1832454640Bean {
                /**
                 * subTags : [{"tagId":1404,"tagType":"subject","tagName":"上班族","nextStage":"-11770465"},{"tagId":1406,"tagType":"subject","tagName":"求职者","nextStage":"-11770465"},{"tagId":1408,"tagType":"subject","tagName":"自由派","nextStage":"-11770465"}]
                 * id : 1832454640
                 * showNext : true
                 * title : 其他
                 * multiType : radio
                 */

                private String id;
                private boolean showNext;
                private String title;
                private String multiType;
                private List<SubTagsBean> subTags;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public boolean isShowNext() {
                    return showNext;
                }

                public void setShowNext(boolean showNext) {
                    this.showNext = showNext;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getMultiType() {
                    return multiType;
                }

                public void setMultiType(String multiType) {
                    this.multiType = multiType;
                }

                public List<SubTagsBean> getSubTags() {
                    return subTags;
                }

                public void setSubTags(List<SubTagsBean> subTags) {
                    this.subTags = subTags;
                }

            }

            public static class _$1521900098Bean {
                /**
                 * subTags : [{"tagId":1458,"tagType":"subject","tagName":"语文","nextStage":"-1"},{"tagId":1460,"tagType":"subject","tagName":"数学","nextStage":"-1"},{"tagId":1462,"tagType":"subject","tagName":"英语","nextStage":"-1"},{"tagId":1538,"tagType":"subject","tagName":"物理","nextStage":"-1"},{"tagId":2360,"tagType":"subject","tagName":"化学","nextStage":"-1"},{"tagId":2446,"tagType":"subject","tagName":"生物","nextStage":"-1"},{"tagId":1930,"tagType":"subject","tagName":"家长频道","nextStage":"-1"}]
                 * id : 1521900098
                 * showNext : true
                 * title : 初二科目
                 * multiType : radio
                 */

                private String id;
                private boolean showNext;
                private String title;
                private String multiType;
                private List<SubTagsBean> subTags;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public boolean isShowNext() {
                    return showNext;
                }

                public void setShowNext(boolean showNext) {
                    this.showNext = showNext;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getMultiType() {
                    return multiType;
                }

                public void setMultiType(String multiType) {
                    this.multiType = multiType;
                }

                public List<SubTagsBean> getSubTags() {
                    return subTags;
                }

                public void setSubTags(List<SubTagsBean> subTags) {
                    this.subTags = subTags;
                }

            }

            public static class _$386667459Bean {
                /**
                 * subTags : [{"tagId":1464,"tagType":"subject","tagName":"语文","nextStage":"-1"},{"tagId":1466,"tagType":"subject","tagName":"数学","nextStage":"-1"},{"tagId":1468,"tagType":"subject","tagName":"英语","nextStage":"-1"},{"tagId":1534,"tagType":"subject","tagName":"物理","nextStage":"-1"},{"tagId":1536,"tagType":"subject","tagName":"化学","nextStage":"-1"},{"tagId":2448,"tagType":"subject","tagName":"生物","nextStage":"-1"},{"tagId":1930,"tagType":"subject","tagName":"家长频道","nextStage":"-1"}]
                 * id : 386667459
                 * showNext : false
                 * title : 初三科目
                 * multiType : radio
                 */

                private String id;
                private boolean showNext;
                private String title;
                private String multiType;
                private List<SubTagsBean> subTags;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public boolean isShowNext() {
                    return showNext;
                }

                public void setShowNext(boolean showNext) {
                    this.showNext = showNext;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getMultiType() {
                    return multiType;
                }

                public void setMultiType(String multiType) {
                    this.multiType = multiType;
                }

                public List<SubTagsBean> getSubTags() {
                    return subTags;
                }

                public void setSubTags(List<SubTagsBean> subTags) {
                    this.subTags = subTags;
                }

            }

            public static class _$1293367281Bean {
                /**
                 * subTags : [{"tagId":414,"tagType":"subject","tagName":"英语提升","nextStage":-1},{"tagId":870,"tagType":"subject","tagName":"四六级","nextStage":-1},{"tagId":424,"tagType":"subject","tagName":"考研","nextStage":-1},{"tagId":1110,"tagType":"subject","tagName":"兴趣技能","nextStage":-1},{"tagId":828,"tagType":"subject","tagName":"逻辑英语","nextStage":-1},{"tagId":418,"tagType":"subject","tagName":"小语种","nextStage":-1},{"tagId":572,"tagType":"subject","tagName":"雅思托福","nextStage":-1},{"tagId":896,"tagType":"subject","tagName":"专四专八","nextStage":-1},{"tagId":458,"tagType":"subject","tagName":"教师资格","nextStage":-1},{"tagId":1542,"tagType":"subject","tagName":"职业考证","nextStage":-1},{"tagId":1078,"tagType":"subject","tagName":"编程开发","nextStage":-1}]
                 * id : -1293367281
                 * showNext : false
                 * title : 大一兴趣
                 * multiType : checkbox
                 * nextStage : -1
                 */

                private String id;
                private String showNext;
                private String title;
                private String multiType;
                private int nextStage;
                private List<SubTagsBean> subTags;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getShowNext() {
                    return showNext;
                }

                public void setShowNext(String showNext) {
                    this.showNext = showNext;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getMultiType() {
                    return multiType;
                }

                public void setMultiType(String multiType) {
                    this.multiType = multiType;
                }

                public int getNextStage() {
                    return nextStage;
                }

                public void setNextStage(int nextStage) {
                    this.nextStage = nextStage;
                }

                public List<SubTagsBean> getSubTags() {
                    return subTags;
                }

                public void setSubTags(List<SubTagsBean> subTags) {
                    this.subTags = subTags;
                }

            }

            public static class _$65414353Bean {
                /**
                 * subTags : [{"tagId":424,"tagType":"subject","tagName":"考研","nextStage":-1},{"tagId":870,"tagType":"subject","tagName":"四六级","nextStage":-1},{"tagId":414,"tagType":"subject","tagName":"英语提升","nextStage":-1},{"tagId":1110,"tagType":"subject","tagName":"兴趣技能","nextStage":-1},{"tagId":828,"tagType":"subject","tagName":"逻辑英语","nextStage":-1},{"tagId":418,"tagType":"subject","tagName":"小语种","nextStage":-1},{"tagId":572,"tagType":"subject","tagName":"雅思托福","nextStage":-1},{"tagId":896,"tagType":"subject","tagName":"专四专八","nextStage":-1},{"tagId":458,"tagType":"subject","tagName":"教师资格","nextStage":-1},{"tagId":1542,"tagType":"subject","tagName":"职业考证","nextStage":-1},{"tagId":1078,"tagType":"subject","tagName":"编程开发","nextStage":-1}]
                 * id : 65414353
                 * showNext : false
                 * title : 大三兴趣
                 * multiType : checkbox
                 * nextStage : -1
                 */

                private String id;
                private String showNext;
                private String title;
                private String multiType;
                private int nextStage;
                private List<SubTagsBean> subTags;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getShowNext() {
                    return showNext;
                }

                public void setShowNext(String showNext) {
                    this.showNext = showNext;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getMultiType() {
                    return multiType;
                }

                public void setMultiType(String multiType) {
                    this.multiType = multiType;
                }

                public int getNextStage() {
                    return nextStage;
                }

                public void setNextStage(int nextStage) {
                    this.nextStage = nextStage;
                }

                public List<SubTagsBean> getSubTags() {
                    return subTags;
                }

                public void setSubTags(List<SubTagsBean> subTags) {
                    this.subTags = subTags;
                }

            }

            public static class _$1773877388Bean {
                /**
                 * subTags : [{"tagId":1062,"tagType":"subject","tagName":"一年级","nextStage":"-739657361"},{"tagId":1064,"tagType":"subject","tagName":"二年级","nextStage":"-1267607113"},{"tagId":1066,"tagType":"subject","tagName":"三年级","nextStage":"1099221270"},{"tagId":1068,"tagType":"subject","tagName":"四年级","nextStage":"-1241354076"},{"tagId":1070,"tagType":"subject","tagName":"五年级","nextStage":"-1643733803"},{"tagId":1072,"tagType":"subject","tagName":"六年级","nextStage":"1762259370"}]
                 * id : 1773877388
                 * showNext : false
                 * title : 小学
                 * multiType : radio
                 */

                private String id;
                private String showNext;
                private String title;
                private String multiType;
                private List<SubTagsBean> subTags;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getShowNext() {
                    return showNext;
                }

                public void setShowNext(String showNext) {
                    this.showNext = showNext;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getMultiType() {
                    return multiType;
                }

                public void setMultiType(String multiType) {
                    this.multiType = multiType;
                }

                public List<SubTagsBean> getSubTags() {
                    return subTags;
                }

                public void setSubTags(List<SubTagsBean> subTags) {
                    this.subTags = subTags;
                }

            }

            public static class _$1864008760Bean {
                /**
                 * subTags : [{"tagId":2054,"tagType":"subject","tagName":"寒春新课","nextStage":"-1"},{"tagId":1480,"tagType":"subject","tagName":"语文","nextStage":"-1"},{"tagId":1474,"tagType":"subject","tagName":"英语","nextStage":"-1"},{"tagId":1486,"tagType":"subject","tagName":"数学","nextStage":"-1"},{"tagId":1492,"tagType":"subject","tagName":"物理","nextStage":"-1"},{"tagId":1498,"tagType":"subject","tagName":"化学","nextStage":"-1"},{"tagId":1504,"tagType":"subject","tagName":"生物","nextStage":"-1"},{"tagId":1510,"tagType":"subject","tagName":"地理","nextStage":"-1"},{"tagId":1516,"tagType":"subject","tagName":"历史","nextStage":"-1"},{"tagId":1522,"tagType":"subject","tagName":"政治","nextStage":"-1"},{"tagId":1932,"tagType":"subject","tagName":"学霸访谈","nextStage":"-1"}]
                 * id : 1864008760
                 * showNext : true
                 * title : 高二科目
                 * multiType : radio
                 */

                private String id;
                private boolean showNext;
                private String title;
                private String multiType;
                private List<SubTagsBean> subTags;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public boolean isShowNext() {
                    return showNext;
                }

                public void setShowNext(boolean showNext) {
                    this.showNext = showNext;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getMultiType() {
                    return multiType;
                }

                public void setMultiType(String multiType) {
                    this.multiType = multiType;
                }

                public List<SubTagsBean> getSubTags() {
                    return subTags;
                }

                public void setSubTags(List<SubTagsBean> subTags) {
                    this.subTags = subTags;
                }

            }

            public static class _$1241354076Bean {
                /**
                 * subTags : [{"tagId":1434,"tagType":"subject","tagName":"语文","nextStage":-1},{"tagId":1436,"tagType":"subject","tagName":"数学","nextStage":-1},{"tagId":1438,"tagType":"subject","tagName":"英语","nextStage":-1},{"tagId":1528,"tagType":"subject","tagName":"少儿编程","nextStage":-1},{"tagId":1928,"tagType":"subject","tagName":"家长频道","nextStage":-1}]
                 * id : -1241354076
                 * showNext : true
                 * title : 小学四年级科目
                 * multiType : radio
                 */

                private String id;
                private boolean showNext;
                private String title;
                private String multiType;
                private List<SubTagsBean> subTags;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public boolean isShowNext() {
                    return showNext;
                }

                public void setShowNext(boolean showNext) {
                    this.showNext = showNext;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getMultiType() {
                    return multiType;
                }

                public void setMultiType(String multiType) {
                    this.multiType = multiType;
                }

                public List<SubTagsBean> getSubTags() {
                    return subTags;
                }

                public void setSubTags(List<SubTagsBean> subTags) {
                    this.subTags = subTags;
                }

            }

            public static class _$1003657994Bean {
                /**
                 * subTags : [{"tagId":1224,"tagType":"subject","tagName":"初一","nextStage":"1173426265"},{"tagId":1226,"tagType":"subject","tagName":"初二","nextStage":"1521900098"},{"tagId":1228,"tagType":"subject","tagName":"初三","nextStage":"386667459"}]
                 * id : 1003657994
                 * showNext : false
                 * title : 初中
                 * multiType : radio
                 */

                private String id;
                private String showNext;
                private String title;
                private String multiType;
                private List<SubTagsBean> subTags;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getShowNext() {
                    return showNext;
                }

                public void setShowNext(String showNext) {
                    this.showNext = showNext;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getMultiType() {
                    return multiType;
                }

                public void setMultiType(String multiType) {
                    this.multiType = multiType;
                }

                public List<SubTagsBean> getSubTags() {
                    return subTags;
                }

                public void setSubTags(List<SubTagsBean> subTags) {
                    this.subTags = subTags;
                }
            }

            public static class _$855824338Bean {
                /**
                 * subTags : [{"tagId":2056,"tagType":"subject","tagName":"二轮新课","nextStage":"-1"},{"tagId":1482,"tagType":"subject","tagName":"语文","nextStage":"-1"},{"tagId":1488,"tagType":"subject","tagName":"数学","nextStage":"-1"},{"tagId":1476,"tagType":"subject","tagName":"英语","nextStage":"-1"},{"tagId":1494,"tagType":"subject","tagName":"物理","nextStage":"-1"},{"tagId":1500,"tagType":"subject","tagName":"化学","nextStage":"-1"},{"tagId":1506,"tagType":"subject","tagName":"生物","nextStage":"-1"},{"tagId":1518,"tagType":"subject","tagName":"历史","nextStage":"-1"},{"tagId":1512,"tagType":"subject","tagName":"地理","nextStage":"-1"},{"tagId":1524,"tagType":"subject","tagName":"政治","nextStage":"-1"},{"tagId":1932,"tagType":"subject","tagName":"学霸访谈","nextStage":"-1"},{"tagId":2012,"tagType":"sub_subject","tagName":"新大一","nextStage":"-1"}]
                 * id : -855824338
                 * showNext : true
                 * title : 高三科目
                 * multiType : radio
                 */

                private String id;
                private boolean showNext;
                private String title;
                private String multiType;
                private List<SubTagsBean> subTags;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public boolean isShowNext() {
                    return showNext;
                }

                public void setShowNext(boolean showNext) {
                    this.showNext = showNext;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getMultiType() {
                    return multiType;
                }

                public void setMultiType(String multiType) {
                    this.multiType = multiType;
                }

                public List<SubTagsBean> getSubTags() {
                    return subTags;
                }

                public void setSubTags(List<SubTagsBean> subTags) {
                    this.subTags = subTags;
                }

            }

            public static class _$1267607113Bean {
                /**
                 * subTags : [{"tagId":1422,"tagType":"subject","tagName":"语文","nextStage":-1},{"tagId":1424,"tagType":"subject","tagName":"数学","nextStage":-1},{"tagId":1426,"tagType":"subject","tagName":"英语","nextStage":-1},{"tagId":1528,"tagType":"subject","tagName":"少儿编程","nextStage":-1},{"tagId":2086,"tagType":"subject","tagName":"少儿美术","nextStage":-1},{"tagId":1928,"tagType":"subject","tagName":"家长频道","nextStage":-1}]
                 * id : -1267607113
                 * showNext : true
                 * title : 小学二年级科目
                 * multiType : radio
                 */

                private String id;
                private boolean showNext;
                private String title;
                private String multiType;
                private List<SubTagsBean> subTags;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public boolean isShowNext() {
                    return showNext;
                }

                public void setShowNext(boolean showNext) {
                    this.showNext = showNext;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getMultiType() {
                    return multiType;
                }

                public void setMultiType(String multiType) {
                    this.multiType = multiType;
                }

                public List<SubTagsBean> getSubTags() {
                    return subTags;
                }

                public void setSubTags(List<SubTagsBean> subTags) {
                    this.subTags = subTags;
                }

            }

            public static class _$686187771Bean {
                /**
                 * subTags : [{"tagId":2052,"tagType":"subject","tagName":"寒春新课","nextStage":"-1"},{"tagId":1478,"tagType":"subject","tagName":"语文","nextStage":"-1"},{"tagId":1472,"tagType":"subject","tagName":"英语","nextStage":"-1"},{"tagId":1484,"tagType":"subject","tagName":"数学","nextStage":"-1"},{"tagId":1490,"tagType":"subject","tagName":"物理","nextStage":"-1"},{"tagId":1496,"tagType":"subject","tagName":"化学","nextStage":"-1"},{"tagId":1502,"tagType":"subject","tagName":"生物","nextStage":"-1"},{"tagId":1508,"tagType":"subject","tagName":"地理","nextStage":"-1"},{"tagId":1514,"tagType":"subject","tagName":"历史","nextStage":"-1"},{"tagId":1932,"tagType":"subject","tagName":"学霸访谈","nextStage":"-1"}]
                 * id : -686187771
                 * showNext : true
                 * title : 高一科目
                 * multiType : radio
                 */

                private String id;
                private boolean showNext;
                private String title;
                private String multiType;
                private List<SubTagsBean> subTags;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public boolean isShowNext() {
                    return showNext;
                }

                public void setShowNext(boolean showNext) {
                    this.showNext = showNext;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getMultiType() {
                    return multiType;
                }

                public void setMultiType(String multiType) {
                    this.multiType = multiType;
                }

                public List<SubTagsBean> getSubTags() {
                    return subTags;
                }

                public void setSubTags(List<SubTagsBean> subTags) {
                    this.subTags = subTags;
                }

            }
        }
    }
}
