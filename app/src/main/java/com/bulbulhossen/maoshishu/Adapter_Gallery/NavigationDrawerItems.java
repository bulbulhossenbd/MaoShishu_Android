package com.bulbulhossen.maoshishu.Adapter_Gallery;


public class NavigationDrawerItems {

        private boolean showNotify;
        private String title;


        public NavigationDrawerItems() {

        }

        public NavigationDrawerItems(boolean showNotify, String title) {
            this.showNotify = showNotify;
            this.title = title;
        }

        public boolean isShowNotify() {
            return showNotify;
        }

        public void setShowNotify(boolean showNotify) {
            this.showNotify = showNotify;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

}