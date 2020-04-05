package com.example.lesson.app.data.entity;

import java.io.Serializable;
import java.util.List;

public class VideoBean {

    /**
     * msg : success
     * code : 0
     * data : {"video":[{"img":"https://oimagea6.ydstatic.com/image?id=4481142214880642818&product=xue","tagId":432,"opId":131230,"urlId":"49f2b1443a6a41a0b4caac121e51c0aa","title":"2020寒假系统班礼盒全网首发","type":"video","articleUrl":"https://c.youdao.com/xue/activity/czzgzlihe.html?outVendor=appvideo_czzty_czzgzlihe_1202","url":"https://c.youdao.com/xue/activity/czzgzlihe.html?outVendor=appvideo_czzty_czzgzlihe_1202","urlType":"topic","videoUrl":"http://stream.youdao.com/course2/-106728875_191122_110837.mp4","viewed":89324,"rank":66833,"validTime":1576491608000,"id":"b3b45ae702bc42af887ea01a0ba3e50e","endTime":1580466740000},{"img":"https://oimagea5.ydstatic.com/image?id=-5318014894101646039&product=xue","tagId":432,"opId":134135,"urlId":"df1d78217a7d49d49226711961b704f6","title":"2020寒春课程全新升级","type":"video","articleUrl":"https://c.youdao.com/xue/activity/cz2020hanchunkc.html?outVendor=appvideo_czzty_cz2020hanchunkc_1216","url":"https://c.youdao.com/xue/activity/cz2020hanchunkc.html?outVendor=appvideo_czzty_cz2020hanchunkc_1216","urlType":"topic","videoUrl":"http://stream.youdao.com/course2/729921761_191216_181443.mp4","viewed":63,"rank":65532,"validTime":1576491526000,"id":"e6d4bfc2491e4825a9d3f672cdbe450f","endTime":1584806399000}]}
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
        private List<PlayerBean> video;

        public List<PlayerBean> getVideo() {
            return video;
        }

        public void setVideo(List<PlayerBean> video) {
            this.video = video;
        }

        public static class PlayerBean implements Serializable {
            /**
             * img : https://oimagea6.ydstatic.com/image?id=4481142214880642818&product=xue
             * tagId : 432
             * opId : 131230
             * urlId : 49f2b1443a6a41a0b4caac121e51c0aa
             * title : 2020寒假系统班礼盒全网首发
             * type : video
             * articleUrl : https://c.youdao.com/xue/activity/czzgzlihe.html?outVendor=appvideo_czzty_czzgzlihe_1202
             * url : https://c.youdao.com/xue/activity/czzgzlihe.html?outVendor=appvideo_czzty_czzgzlihe_1202
             * urlType : topic
             * videoUrl : http://stream.youdao.com/course2/-106728875_191122_110837.mp4
             * viewed : 89324
             * rank : 66833
             * validTime : 1576491608000
             * id : b3b45ae702bc42af887ea01a0ba3e50e
             * endTime : 1580466740000
             */

            private String img;
            private int tagId;
            private int opId;
            private String urlId;
            private String title;
            private String type;
            private String articleUrl;
            private String url;
            private String urlType;
            private String videoUrl;
            private int viewed;
            private int rank;
            private long validTime;
            private String id;
            private long endTime;

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

            public int getOpId() {
                return opId;
            }

            public void setOpId(int opId) {
                this.opId = opId;
            }

            public String getUrlId() {
                return urlId;
            }

            public void setUrlId(String urlId) {
                this.urlId = urlId;
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

            public String getArticleUrl() {
                return articleUrl;
            }

            public void setArticleUrl(String articleUrl) {
                this.articleUrl = articleUrl;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getUrlType() {
                return urlType;
            }

            public void setUrlType(String urlType) {
                this.urlType = urlType;
            }

            public String getVideoUrl() {
                return videoUrl;
            }

            public void setVideoUrl(String videoUrl) {
                this.videoUrl = videoUrl;
            }

            public int getViewed() {
                return viewed;
            }

            public void setViewed(int viewed) {
                this.viewed = viewed;
            }

            public int getRank() {
                return rank;
            }

            public void setRank(int rank) {
                this.rank = rank;
            }

            public long getValidTime() {
                return validTime;
            }

            public void setValidTime(long validTime) {
                this.validTime = validTime;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public long getEndTime() {
                return endTime;
            }

            public void setEndTime(long endTime) {
                this.endTime = endTime;
            }
        }
    }
}
