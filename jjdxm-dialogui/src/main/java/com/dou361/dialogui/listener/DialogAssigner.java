package com.dou361.dialogui.listener;

import android.app.Activity;
import android.content.Context;
import android.view.Gravity;
import android.view.View;

import com.dou361.dialogui.bean.BuildBean;
import com.dou361.dialogui.config.CommonConfig;

import java.util.List;

/**
 * Created by Administrator on 2016/10/9 0009.
 */
public class DialogAssigner implements Assignable {

    private static DialogAssigner instance;

    private DialogAssigner() {

    }

    public static DialogAssigner getInstance() {
        if (instance == null) {
            instance = new DialogAssigner();
        }
        return instance;
    }


    @Override
    public BuildBean assignDatePickCenter(Context context, long date, int dateType, int tag, DialogUIDateTimeSaveListener listener) {
        BuildBean bean = new BuildBean();
        bean.context = context;
        bean.gravity = Gravity.CENTER;
        bean.cancelable = true;
        bean.outsideTouchable = true;
        bean.type = CommonConfig.TYPE_DATEPICK_CENTER;
        bean.dateTimeListener = listener;
        bean.dateType = dateType;
        bean.date = date;
        bean.tag = tag;
        return bean;
    }

    @Override
    public BuildBean assignDatePickBottom(Context context, long date, int dateType, int tag, DialogUIDateTimeSaveListener listener) {
        BuildBean bean = new BuildBean();
        bean.context = context;
        bean.gravity = Gravity.BOTTOM;
        bean.cancelable = true;
        bean.outsideTouchable = true;
        bean.type = CommonConfig.TYPE_DATEPICK_BOTTOM;
        bean.dateTimeListener = listener;
        bean.dateType = dateType;
        bean.date = date;
        bean.tag = tag;
        return bean;
    }

    @Override
    public BuildBean assignLoadingHorizontal(Context context, CharSequence msg, boolean cancleable, boolean outsideTouchable, boolean isWhiteBg) {
        BuildBean bean = new BuildBean();
        bean.context = context;
        bean.msg = msg;
        bean.isWhiteBg = isWhiteBg;
        bean.gravity = Gravity.CENTER;
        bean.cancelable = cancleable;
        bean.outsideTouchable = outsideTouchable;
        bean.type = CommonConfig.TYPE_LOADING_HORIZONTAL;
        return bean;
    }

    @Override
    public BuildBean assignLoadingVertical(Context context, CharSequence msg, boolean cancleable, boolean outsideTouchable, boolean isWhiteBg) {
        BuildBean bean = new BuildBean();
        bean.context = context;
        bean.msg = msg;
        bean.isWhiteBg = isWhiteBg;
        bean.gravity = Gravity.CENTER;
        bean.cancelable = cancleable;
        bean.outsideTouchable = outsideTouchable;
        bean.type = CommonConfig.TYPE_LOADING_VERTICAL;
        return bean;
    }

    @Override
    public BuildBean assignMdLoadingHorizontal(Context context, CharSequence msg, boolean cancleable, boolean outsideTouchable, boolean isWhiteBg) {
        BuildBean bean = new BuildBean();
        bean.context = context;
        bean.msg = msg;
        bean.isWhiteBg = isWhiteBg;
        bean.gravity = Gravity.CENTER;
        bean.cancelable = cancleable;
        bean.outsideTouchable = outsideTouchable;
        bean.type = CommonConfig.TYPE_MD_LOADING_HORIZONTAL;
        return bean;
    }

    @Override
    public BuildBean assignMdLoadingVertical(Context context, CharSequence msg, boolean cancleable, boolean outsideTouchable, boolean isWhiteBg) {
        BuildBean bean = new BuildBean();
        bean.context = context;
        bean.msg = msg;
        bean.isWhiteBg = isWhiteBg;
        bean.gravity = Gravity.CENTER;
        bean.cancelable = cancleable;
        bean.outsideTouchable = outsideTouchable;
        bean.type = CommonConfig.TYPE_MD_LOADING_VERTICAL;
        return bean;
    }

    @Override
    public BuildBean assignMdAlert(Activity activity, CharSequence title, CharSequence msg, boolean cancleable, boolean outsideTouchable, DialogUIListener listener) {
        BuildBean bean = new BuildBean();
        bean.context = activity;
        bean.msg = msg;
        bean.title = title;
        bean.gravity = Gravity.CENTER;
        bean.cancelable = cancleable;
        bean.outsideTouchable = outsideTouchable;
        bean.listener = listener;
        bean.type = CommonConfig.TYPE_MD_ALERT;
        bean.btn1Color = CommonConfig.mdBtnColor;
        bean.btn2Color = CommonConfig.mdBtnColor;
        bean.btn3Color = CommonConfig.mdBtnColor;
        return bean;
    }

    @Override
    public BuildBean assignSingleChoose(Activity context, CharSequence title, int defaultChosen, CharSequence[] words, boolean cancleable, boolean outsideTouchable, DialogUIItemListener listener) {
        BuildBean bean = new BuildBean();
        bean.context = context;
        bean.title = title;
        bean.gravity = Gravity.CENTER;
        bean.cancelable = cancleable;
        bean.outsideTouchable = outsideTouchable;
        bean.itemListener = listener;
        bean.wordsMd = words;
        bean.type = CommonConfig.TYPE_SINGLE_CHOOSE;
        bean.defaultChosen = defaultChosen;
        bean.btn1Color = CommonConfig.mdBtnColor;
        bean.btn2Color = CommonConfig.mdBtnColor;
        bean.btn3Color = CommonConfig.mdBtnColor;
        return bean;
    }

    @Override
    public BuildBean assignMdMultiChoose(Activity context, CharSequence title, CharSequence[] words, boolean[] checkedItems, boolean cancleable, boolean outsideTouchable, DialogUIListener btnListener) {
        BuildBean bean = new BuildBean();
        bean.context = context;
        bean.msg = title;
        bean.title = title;
        bean.gravity = Gravity.CENTER;
        bean.cancelable = cancleable;
        bean.outsideTouchable = outsideTouchable;
        bean.listener = btnListener;
        bean.wordsMd = words;
        bean.checkedItems = checkedItems;
        bean.type = CommonConfig.TYPE_MD_MULTI_CHOOSE;
        bean.btn1Color = CommonConfig.mdBtnColor;
        bean.btn2Color = CommonConfig.mdBtnColor;
        bean.btn3Color = CommonConfig.mdBtnColor;
        return bean;
    }

    @Override
    public BuildBean assignAlert(Context activity, CharSequence title, CharSequence msg, CharSequence hint1, CharSequence hint2,
                                 CharSequence firstTxt, CharSequence secondTxt, boolean isVertical,boolean cancleable, boolean outsideTouchable, DialogUIListener listener) {
        BuildBean bean = new BuildBean();
        bean.context = activity;
        bean.msg = msg;
        bean.title = title;
        bean.hint1 = hint1;
        bean.hint2 = hint2;
        bean.text1 = firstTxt;
        bean.text2 = secondTxt;
        bean.isVertical = isVertical;
        bean.gravity = Gravity.CENTER;
        bean.cancelable = cancleable;
        bean.outsideTouchable = outsideTouchable;
        bean.listener = listener;
        bean.type = CommonConfig.TYPE_ALERT;
        return bean;
    }

    @Override
    public BuildBean assignCenterSheet(Context context, List<String> datas, boolean cancleable, boolean outsideTouchable, DialogUIItemListener listener) {
        BuildBean bean = new BuildBean();
        bean.context = context;
        bean.itemListener = listener;
        bean.lvDatas = datas;
        bean.gravity = Gravity.CENTER;
        bean.cancelable = cancleable;
        bean.outsideTouchable = outsideTouchable;
        bean.type = CommonConfig.TYPE_CENTER_SHEET;

        return bean;
    }

    @Override
    public BuildBean assignBottomSheetAndCancel(Context context, List<String> datas, CharSequence bottomTxt, boolean cancleable, boolean outsideTouchable, DialogUIItemListener listener) {
        BuildBean bean = new BuildBean();
        bean.context = context;
        bean.gravity = Gravity.BOTTOM;
        bean.cancelable = cancleable;
        bean.outsideTouchable = outsideTouchable;
        bean.itemListener = listener;
        bean.lvDatas = datas;
        bean.type = CommonConfig.TYPE_BOTTOM_SHEET_CANCEL;
        return bean;
    }

    @Override
    public BuildBean assignCustomAlert(Context context, View contentView, int gravity, boolean cancleable, boolean outsideTouchable) {
        BuildBean bean = new BuildBean();
        bean.context = context;
        bean.customView = contentView;
        bean.gravity = gravity;
        bean.cancelable = cancleable;
        bean.outsideTouchable = outsideTouchable;
        bean.type = CommonConfig.TYPE_CUSTOM_ALERT;
        return bean;
    }

    @Override
    public BuildBean assignMdBottomSheetVertical(Context context, CharSequence title, List<String> datas, CharSequence bottomTxt, boolean cancleable, boolean outsideTouchable, DialogUIItemListener listener) {
        BuildBean bean = new BuildBean();
        bean.context = context;
        bean.title = title;
        bean.lvDatas = datas;
        bean.bottomTxt = bottomTxt;
        bean.gravity = Gravity.BOTTOM;
        bean.cancelable = cancleable;
        bean.outsideTouchable = outsideTouchable;
        bean.itemListener = listener;
        bean.type = CommonConfig.TYPE_BOTTOM_SHEET_VERTICAL;
        return bean;
    }

    @Override
    public BuildBean assignMdBottomSheetHorizontal(Context context, CharSequence title, List<String> datas, CharSequence bottomTxt, int columnsNum, boolean cancleable, boolean outsideTouchable, DialogUIItemListener listener) {
        BuildBean bean = new BuildBean();
        bean.context = context;
        bean.title = title;
        bean.lvDatas = datas;
        bean.bottomTxt = bottomTxt;
        bean.gravity = Gravity.BOTTOM;
        bean.cancelable = cancleable;
        bean.outsideTouchable = outsideTouchable;
        bean.itemListener = listener;
        bean.gridColumns = columnsNum;
        bean.type = CommonConfig.TYPE_BOTTOM_SHEET_HORIZONTAL;
        return bean;
    }


}