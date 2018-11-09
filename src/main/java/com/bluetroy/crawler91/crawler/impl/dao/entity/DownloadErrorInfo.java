package com.bluetroy.crawler91.crawler.impl.dao.entity;

import com.bluetroy.crawler91.crawler.impl.utils.TimeUtils;
import lombok.ToString;

import java.util.LinkedList;
import java.util.List;

/**
 * @author heyixin
 */
@ToString
public class DownloadErrorInfo {
    private final String key;
    private final List<String> errorTimes = new LinkedList<>();
    private int errorTime;

    public DownloadErrorInfo(String key) {
        this.key = key;
    }

    public void update() {
        errorTime++;
        errorTimes.add(TimeUtils.getDate());
    }
}