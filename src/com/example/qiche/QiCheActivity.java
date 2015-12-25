package com.example.qiche;

import java.util.ArrayList;
import java.util.List;

import com.example.movie.Movie;
import com.example.test.R;
import com.example.testview.AiJieAdapter;
import com.example.testview.Shoe;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class QiCheActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_qiche_demo);
		ListView qiView=(ListView)findViewById(R.id.qicheView);
		QiCheAdapter qicheAdapter=new QiCheAdapter();
		List<QiChe> list = new ArrayList<QiChe>();
		QiChe qiche1 = new QiChe(100000,"红色","东风日产","B247801","光阴汽车有限公司");
		list.add(qiche1);
		QiChe qiche2 = new QiChe(1033000,"黑色","本田","E247801","八骏汽车有限公司");
		list.add(qiche2);
		QiChe qiche3 = new QiChe(1200000,"红色","奔驰","F210831","丰台汽车有限公司");
		list.add(qiche3);
		QiChe qiche4 = new QiChe(1040000,"黄色","宝马","W270801","奔仁汽车有限公司");
		list.add(qiche4);
		QiChe qiche5 = new QiChe(13000000,"绿色","路虎","X207801","机遇汽车有限公司");
		list.add(qiche5);

		qicheAdapter.setShowlist(list);
		qiView.setAdapter(qicheAdapter);
	
	}
}
