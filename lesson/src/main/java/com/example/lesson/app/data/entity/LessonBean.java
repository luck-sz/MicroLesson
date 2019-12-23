package com.example.lesson.app.data.entity;

import java.util.List;

public class LessonBean {


    /**
     * msg : success
     * code : 0
     * data : {"subTag":[],"img":"https://oimageb2.ydstatic.com/image?id=-9121031864888550093&product=xue","serial":[{"categoryName":"小学","courseCount":2,"filteredCount":2,"filters":[],"hideNum":true,"id":1016,"marketTags":[],"maxPrice":3,"minPrice":0,"rank":0,"saleNum":0,"serialId":1016,"serialType":"系列课程","teacherList":[{"id":1892,"imgUrl":"https://oimagec5.ydstatic.com/image?id=-506616832816475252&product=xue","name":"孟祥君"},{"id":2700,"imgUrl":"https://oimagea4.ydstatic.com/image?id=8851091440908344139&product=bisheng","name":"梦梦老师"},{"id":2550,"imgUrl":"https://oimageb8.ydstatic.com/image?id=-4167989339775289444&product=xue","name":"林沐"}],"title":"阅读写作\u2022短期集训","type":"serial","useFilter":false},{"categoryName":"小学","courseCount":4,"filteredCount":4,"filters":[],"hideNum":true,"id":960,"marketTags":[],"maxPrice":2180,"minPrice":2180,"rank":0,"saleNum":0,"serialId":960,"serialType":"系列课程","teacherList":[{"id":1892,"imgUrl":"https://oimagec5.ydstatic.com/image?id=-506616832816475252&product=xue","name":"孟祥君"},{"id":2700,"imgUrl":"https://oimagea4.ydstatic.com/image?id=8851091440908344139&product=bisheng","name":"梦梦老师"}],"title":"阅读写作·寒春课程","type":"serial","useFilter":false},{"categoryName":"小学","courseCount":1,"filteredCount":1,"filters":[],"hideNum":true,"id":962,"marketTags":[],"maxPrice":1980,"minPrice":1980,"rank":0,"saleNum":0,"serialId":962,"serialType":"仅限15人","teacherList":[{"id":2550,"imgUrl":"https://oimageb8.ydstatic.com/image?id=-4167989339775289444&product=xue","name":"林沐"}],"title":"VIP小班·寒春课程","type":"serial","useFilter":false}],"subject":"语文","serialCourse":[{"hideNum":true,"id":1016,"serialType":"系列课程","title":"阅读写作\u2022短期集训","useFilter":0},{"hideNum":true,"id":1090,"serialType":"系列课程","title":"VIP小班 互动体验","useFilter":0},{"hideNum":true,"id":960,"serialType":"系列课程","title":"阅读写作·寒春课程","useFilter":0},{"hideNum":true,"id":962,"serialType":"仅限15人","title":"VIP小班·寒春课程","useFilter":0}],"name":"语文","tagType":"subject","column":[],"banner":[{"img":"https://oimagec2.ydstatic.com/image?id=8689192328259882237&product=xue","tagId":1434,"validTime":1576857600000,"endTime":1577375999000,"id":"f44eea98bfe54a0ba291531fe30a7cc2","title":"小学圣诞节专题页2019","type":"topic","url":"https://c.youdao.com/xue/activity/xxshengdan2019.html?outVendor=vpbanner_xxzty_xxshengdan2019_1221"},{"img":"https://oimageb3.ydstatic.com/image?id=-5183590930421320527&product=xue","purchased":false,"tagId":1434,"validTime":1570592769000,"endTime":1580473385000,"id":"47409","time":1570550400000,"title":"【3-4年级】小学语文阅读写作飞跃营","type":"course","courseId":47409,"url":"https://kewap.youdao.com/m/course/detail/47409"},{"img":"https://oimagea6.ydstatic.com/image?id=5391806151207062578&product=xue","purchased":false,"tagId":1434,"validTime":1571890770000,"endTime":1577783315000,"id":"47718","time":1574833980000,"title":"【到课抽奖】【3-4年级】摆脱作文流水账","type":"course","courseId":47718,"url":"https://kewap.youdao.com/m/course/detail/47718"}],"id":1434,"status":0}
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
         * subTag : []
         * img : https://oimageb2.ydstatic.com/image?id=-9121031864888550093&product=xue
         * serial : [{"categoryName":"小学","courseCount":2,"filteredCount":2,"filters":[],"hideNum":true,"id":1016,"marketTags":[],"maxPrice":3,"minPrice":0,"rank":0,"saleNum":0,"serialId":1016,"serialType":"系列课程","teacherList":[{"id":1892,"imgUrl":"https://oimagec5.ydstatic.com/image?id=-506616832816475252&product=xue","name":"孟祥君"},{"id":2700,"imgUrl":"https://oimagea4.ydstatic.com/image?id=8851091440908344139&product=bisheng","name":"梦梦老师"},{"id":2550,"imgUrl":"https://oimageb8.ydstatic.com/image?id=-4167989339775289444&product=xue","name":"林沐"}],"title":"阅读写作\u2022短期集训","type":"serial","useFilter":false},{"categoryName":"小学","courseCount":4,"filteredCount":4,"filters":[],"hideNum":true,"id":960,"marketTags":[],"maxPrice":2180,"minPrice":2180,"rank":0,"saleNum":0,"serialId":960,"serialType":"系列课程","teacherList":[{"id":1892,"imgUrl":"https://oimagec5.ydstatic.com/image?id=-506616832816475252&product=xue","name":"孟祥君"},{"id":2700,"imgUrl":"https://oimagea4.ydstatic.com/image?id=8851091440908344139&product=bisheng","name":"梦梦老师"}],"title":"阅读写作·寒春课程","type":"serial","useFilter":false},{"categoryName":"小学","courseCount":1,"filteredCount":1,"filters":[],"hideNum":true,"id":962,"marketTags":[],"maxPrice":1980,"minPrice":1980,"rank":0,"saleNum":0,"serialId":962,"serialType":"仅限15人","teacherList":[{"id":2550,"imgUrl":"https://oimageb8.ydstatic.com/image?id=-4167989339775289444&product=xue","name":"林沐"}],"title":"VIP小班·寒春课程","type":"serial","useFilter":false}]
         * subject : 语文
         * serialCourse : [{"hideNum":true,"id":1016,"serialType":"系列课程","title":"阅读写作\u2022短期集训","useFilter":0},{"hideNum":true,"id":1090,"serialType":"系列课程","title":"VIP小班 互动体验","useFilter":0},{"hideNum":true,"id":960,"serialType":"系列课程","title":"阅读写作·寒春课程","useFilter":0},{"hideNum":true,"id":962,"serialType":"仅限15人","title":"VIP小班·寒春课程","useFilter":0}]
         * name : 语文
         * tagType : subject
         * column : []
         * banner : [{"img":"https://oimagec2.ydstatic.com/image?id=8689192328259882237&product=xue","tagId":1434,"validTime":1576857600000,"endTime":1577375999000,"id":"f44eea98bfe54a0ba291531fe30a7cc2","title":"小学圣诞节专题页2019","type":"topic","url":"https://c.youdao.com/xue/activity/xxshengdan2019.html?outVendor=vpbanner_xxzty_xxshengdan2019_1221"},{"img":"https://oimageb3.ydstatic.com/image?id=-5183590930421320527&product=xue","purchased":false,"tagId":1434,"validTime":1570592769000,"endTime":1580473385000,"id":"47409","time":1570550400000,"title":"【3-4年级】小学语文阅读写作飞跃营","type":"course","courseId":47409,"url":"https://kewap.youdao.com/m/course/detail/47409"},{"img":"https://oimagea6.ydstatic.com/image?id=5391806151207062578&product=xue","purchased":false,"tagId":1434,"validTime":1571890770000,"endTime":1577783315000,"id":"47718","time":1574833980000,"title":"【到课抽奖】【3-4年级】摆脱作文流水账","type":"course","courseId":47718,"url":"https://kewap.youdao.com/m/course/detail/47718"}]
         * id : 1434
         * status : 0
         */

        private String img;
        private String subject;
        private String name;
        private String tagType;
        private int id;
        private int status;
        private List<?> subTag;
        private List<SerialBean> serial;
        private List<SerialCourseBean> serialCourse;
        private List<?> column;
        private List<BannerBean> banner;

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTagType() {
            return tagType;
        }

        public void setTagType(String tagType) {
            this.tagType = tagType;
        }

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

        public List<?> getSubTag() {
            return subTag;
        }

        public void setSubTag(List<?> subTag) {
            this.subTag = subTag;
        }

        public List<SerialBean> getSerial() {
            return serial;
        }

        public void setSerial(List<SerialBean> serial) {
            this.serial = serial;
        }

        public List<SerialCourseBean> getSerialCourse() {
            return serialCourse;
        }

        public void setSerialCourse(List<SerialCourseBean> serialCourse) {
            this.serialCourse = serialCourse;
        }

        public List<?> getColumn() {
            return column;
        }

        public void setColumn(List<?> column) {
            this.column = column;
        }

        public List<BannerBean> getBanner() {
            return banner;
        }

        public void setBanner(List<BannerBean> banner) {
            this.banner = banner;
        }

        public static class SerialBean {
            /**
             * categoryName : 小学
             * courseCount : 2
             * filteredCount : 2
             * filters : []
             * hideNum : true
             * id : 1016
             * marketTags : []
             * maxPrice : 3.0
             * minPrice : 0.0
             * rank : 0
             * saleNum : 0
             * serialId : 1016
             * serialType : 系列课程
             * teacherList : [{"id":1892,"imgUrl":"https://oimagec5.ydstatic.com/image?id=-506616832816475252&product=xue","name":"孟祥君"},{"id":2700,"imgUrl":"https://oimagea4.ydstatic.com/image?id=8851091440908344139&product=bisheng","name":"梦梦老师"},{"id":2550,"imgUrl":"https://oimageb8.ydstatic.com/image?id=-4167989339775289444&product=xue","name":"林沐"}]
             * title : 阅读写作•短期集训
             * type : serial
             * useFilter : false
             */

            private String categoryName;
            private int courseCount;
            private int filteredCount;
            private boolean hideNum;
            private int id;
            private double maxPrice;
            private double minPrice;
            private int rank;
            private int saleNum;
            private int serialId;
            private String serialType;
            private String title;
            private String type;
            private boolean useFilter;
            private List<?> filters;
            private List<?> marketTags;
            private List<TeacherListBean> teacherList;

            public String getCategoryName() {
                return categoryName;
            }

            public void setCategoryName(String categoryName) {
                this.categoryName = categoryName;
            }

            public int getCourseCount() {
                return courseCount;
            }

            public void setCourseCount(int courseCount) {
                this.courseCount = courseCount;
            }

            public int getFilteredCount() {
                return filteredCount;
            }

            public void setFilteredCount(int filteredCount) {
                this.filteredCount = filteredCount;
            }

            public boolean isHideNum() {
                return hideNum;
            }

            public void setHideNum(boolean hideNum) {
                this.hideNum = hideNum;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public double getMaxPrice() {
                return maxPrice;
            }

            public void setMaxPrice(double maxPrice) {
                this.maxPrice = maxPrice;
            }

            public double getMinPrice() {
                return minPrice;
            }

            public void setMinPrice(double minPrice) {
                this.minPrice = minPrice;
            }

            public int getRank() {
                return rank;
            }

            public void setRank(int rank) {
                this.rank = rank;
            }

            public int getSaleNum() {
                return saleNum;
            }

            public void setSaleNum(int saleNum) {
                this.saleNum = saleNum;
            }

            public int getSerialId() {
                return serialId;
            }

            public void setSerialId(int serialId) {
                this.serialId = serialId;
            }

            public String getSerialType() {
                return serialType;
            }

            public void setSerialType(String serialType) {
                this.serialType = serialType;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public boolean isUseFilter() {
                return useFilter;
            }

            public void setUseFilter(boolean useFilter) {
                this.useFilter = useFilter;
            }

            public List<?> getFilters() {
                return filters;
            }

            public void setFilters(List<?> filters) {
                this.filters = filters;
            }

            public List<?> getMarketTags() {
                return marketTags;
            }

            public void setMarketTags(List<?> marketTags) {
                this.marketTags = marketTags;
            }

            public List<TeacherListBean> getTeacherList() {
                return teacherList;
            }

            public void setTeacherList(List<TeacherListBean> teacherList) {
                this.teacherList = teacherList;
            }

            public static class TeacherListBean {
                /**
                 * id : 1892
                 * imgUrl : https://oimagec5.ydstatic.com/image?id=-506616832816475252&product=xue
                 * name : 孟祥君
                 */

                private int id;
                private String imgUrl;
                private String name;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getImgUrl() {
                    return imgUrl;
                }

                public void setImgUrl(String imgUrl) {
                    this.imgUrl = imgUrl;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }
        }

        public static class SerialCourseBean {
            /**
             * hideNum : true
             * id : 1016
             * serialType : 系列课程
             * title : 阅读写作•短期集训
             * useFilter : 0
             */

            private boolean hideNum;
            private int id;
            private String serialType;
            private String title;
            private int useFilter;

            public boolean isHideNum() {
                return hideNum;
            }

            public void setHideNum(boolean hideNum) {
                this.hideNum = hideNum;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getSerialType() {
                return serialType;
            }

            public void setSerialType(String serialType) {
                this.serialType = serialType;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getUseFilter() {
                return useFilter;
            }

            public void setUseFilter(int useFilter) {
                this.useFilter = useFilter;
            }
        }

        public static class BannerBean {
            /**
             * img : https://oimagec2.ydstatic.com/image?id=8689192328259882237&product=xue
             * tagId : 1434
             * validTime : 1576857600000
             * endTime : 1577375999000
             * id : f44eea98bfe54a0ba291531fe30a7cc2
             * title : 小学圣诞节专题页2019
             * type : topic
             * url : https://c.youdao.com/xue/activity/xxshengdan2019.html?outVendor=vpbanner_xxzty_xxshengdan2019_1221
             * purchased : false
             * time : 1570550400000
             * courseId : 47409
             */

            private String img;
            private int tagId;
            private long validTime;
            private long endTime;
            private String id;
            private String title;
            private String type;
            private String url;
            private boolean purchased;
            private long time;
            private int courseId;

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public int getTagId() {
                return tagId;
            }

            public void setTagId(int tagId) {
                this.tagId = tagId;
            }

            public long getValidTime() {
                return validTime;
            }

            public void setValidTime(long validTime) {
                this.validTime = validTime;
            }

            public long getEndTime() {
                return endTime;
            }

            public void setEndTime(long endTime) {
                this.endTime = endTime;
            }

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

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public boolean isPurchased() {
                return purchased;
            }

            public void setPurchased(boolean purchased) {
                this.purchased = purchased;
            }

            public long getTime() {
                return time;
            }

            public void setTime(long time) {
                this.time = time;
            }

            public int getCourseId() {
                return courseId;
            }

            public void setCourseId(int courseId) {
                this.courseId = courseId;
            }
        }
    }
}
