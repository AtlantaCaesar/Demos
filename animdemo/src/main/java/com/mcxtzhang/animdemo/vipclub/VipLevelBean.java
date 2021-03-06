package com.mcxtzhang.animdemo.vipclub;

/**
 * 介绍：
 * 作者：zhangxutong
 * 邮箱：mcxtzhang@163.com
 * CSDN：http://blog.csdn.net/zxt0601
 * 时间： 16/12/08.
 */

public class VipLevelBean {
    private int level;
    private int levelValue;
    private boolean isCurrent;

    public VipLevelBean(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public VipLevelBean setLevel(int level) {
        this.level = level;
        return this;
    }

    public boolean isCurrent() {
        return isCurrent;
    }

    public VipLevelBean setCurrent(boolean current) {
        isCurrent = current;
        return this;
    }

    public int getLevelValue() {
        return levelValue;
    }

    public VipLevelBean setLevelValue(int levelValue) {
        this.levelValue = levelValue;
        return this;
    }
}
