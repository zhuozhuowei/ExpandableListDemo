package com.example.aa;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.example.aa.LcBean.DataBean.DetailsBean;
import com.example.aa.R.string;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

        Log.i("exutils--->","fjdslkajfldsjfkljdsa;lkfds");
//      requestWindowFeature(Window.FEATURE_NO_TITLE);

      final ExpandableListAdapter adapter = new BaseExpandableListAdapter() {
          //设置组视图的图片
//          int[] logos = new int[] { R.drawable.ic_launcher, R.drawable.ic_launcher,R.drawable.ic_launcher};

          //          private String [][] generals=ExUtils.getItemChild();
          //子视图图片
          /*public int[][] generallogos = new int[][] {
                  { R.drawable.ic_launcher, R.drawable.ic_launcher,
                          R.drawable.ic_launcher, R.drawable.ic_launcher,
                          R.drawable.ic_launcher, R.drawable.ic_launcher },
                  { R.drawable.ic_launcher, R.drawable.ic_launcher,
                          R.drawable.ic_launcher, R.drawable.ic_launcher,
                          R.drawable.ic_launcher, R.drawable.ic_launcher },
                  { R.drawable.ic_launcher, R.drawable.ic_launcher, R.drawable.ic_launcher,
                          R.drawable.ic_launcher, R.drawable.ic_launcher } };*/

          public List<DetailsBean>	detailsList= ExUtils.gsonData().getData().getDetails();
            /**一级列表数据**/
          public ArrayList<String> getGeneralsTypes(){
        	  ArrayList<String> generalsTypes=new ArrayList<String>();
        	  for(int i=0;i<detailsList.size();i++){

  	  			generalsTypes.add(detailsList.get(i).getTag_title());
  	  		}
			return generalsTypes;

          }
          private ArrayList<String> generalsTypes=getGeneralsTypes();

          /**二级列表数据**/
          public ArrayList<ArrayList<DetailsBean.PictBean>> getGenerals(){
             // Objects[][] objectsesGener=new Objects[detailsList.size()][];
              ArrayList<ArrayList<DetailsBean.PictBean>> generalss = new  ArrayList<ArrayList<DetailsBean.PictBean>>();
              for (int i=0;i<detailsList.size();i++){
                  DetailsBean detailsBean = detailsList.get(i);
                  List<DetailsBean.PictBean> pict = detailsBean.getPict();
                  ArrayList<DetailsBean.PictBean> dpict=new ArrayList<DetailsBean.PictBean>();
                  for (int j=0;j<pict.size();j++){
                      dpict.add(pict.get(j));
                  }
                  generalss.add(dpict);
              }
              Log.i("exutils---2>",generalss.toString());
              return generalss;

          }
          private ArrayList<ArrayList<DetailsBean.PictBean>> generals=getGenerals();



          //自己定义一个获得文字信息的方法
          TextView getTextView() {
              AbsListView.LayoutParams lp = new AbsListView.LayoutParams(
                      ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
              TextView textView = new TextView(
                      MainActivity.this);
              textView.setLayoutParams(lp);
              textView.setGravity(Gravity.CENTER_VERTICAL);
              textView.setPadding(36, 0, 0, 0);
              textView.setTextSize(20);
              textView.setTextColor(Color.BLACK);
              return textView;
          }


          //重写ExpandableListAdapter中的各个方法
          @Override
          public int getGroupCount() {
              // TODO Auto-generated method stub
              return generalsTypes.size();
          }

          @Override
          public Object getGroup(int groupPosition) {
              // TODO Auto-generated method stub
              return generalsTypes.get(groupPosition);
          }

          @Override
          public long getGroupId(int groupPosition) {
              // TODO Auto-generated method stub
              return groupPosition;
          }

          @Override
          public int getChildrenCount(int groupPosition) {
              // TODO Auto-generated method stub
              return generals.get(groupPosition).size();
          }

          @Override
          public DetailsBean.PictBean getChild(int groupPosition, int childPosition) {
              // TODO Auto-generated method stub
              return    generals.get(groupPosition).get(childPosition);
          }

          @Override
          public long getChildId(int groupPosition, int childPosition) {
              // TODO Auto-generated method stub
              return childPosition;
          }

          @Override
          public boolean hasStableIds() {
              // TODO Auto-generated method stub
              return true;
          }

          @Override
          public View getGroupView(int groupPosition, boolean isExpanded,
                                   View convertView, ViewGroup parent) {
              // TODO Auto-generated method stub
              LinearLayout ll = new LinearLayout(
                      MainActivity.this);
//              ll.setOrientation(0);
              ImageView logo = new ImageView(MainActivity.this);
//              logo.setImageResource(logos[groupPosition]);
              logo.setPadding(50, 0, 0, 0);
              ll.addView(logo);
              TextView textView = getTextView();
              textView.setTextColor(Color.BLACK);
              textView.setText(getGroup(groupPosition).toString());
              ll.addView(textView);

              return ll;
          }

          @Override
          public View getChildView(int groupPosition, int childPosition,
                                   boolean isLastChild, View convertView, ViewGroup parent) {
              // TODO Auto-generated method stub
              LinearLayout ll = new LinearLayout(
                      MainActivity.this);
//              ll.setOrientation(0);
//              ImageView generallogo = new ImageView(
//                      MainActivity.this);
//              generallogo
//                      .setImageResource(generallogos[groupPosition][childPosition]);
//              ll.addView(generallogo);
              TextView textView = getTextView();
              textView.setText(getChild(groupPosition, childPosition).getContent());
              ll.addView(textView);

              Log.i("exutils---1>","groupPosition+childPosition=["+groupPosition+","+childPosition+"]");
              Log.i("exutils---1>",getChild(groupPosition, childPosition).getContent());
              return ll;
          }

          @Override
          public boolean isChildSelectable(int groupPosition,
                                           int childPosition) {
              // TODO Auto-generated method stub
              return true;
          }

      };

      ExpandableListView expandableListView = (ExpandableListView) findViewById(R.id.list);
      expandableListView.setAdapter(adapter);


      //设置item点击的监听器
      expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

          @Override
          public boolean onChildClick(ExpandableListView parent, View v,
                                      int groupPosition, int childPosition, long id) {

              Toast.makeText(
                      MainActivity.this,
                      "你点击了" + adapter.getChild(groupPosition, childPosition),
                      Toast.LENGTH_SHORT).show();

              return false;
          }
      });
  }
}





