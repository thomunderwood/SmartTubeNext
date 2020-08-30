package com.liskovsoft.smartyoutubetv2.common.mvp.presenters;

import com.liskovsoft.smartyoutubetv2.common.mvp.models.Video;

public interface VideoItemPresenter<T> extends Presenter<T> {
    void onVideoItemClicked(Video item);
    void onVideoItemLongClicked(Video item);
}