import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.util.Scanner;
public class accc {
	static accc accc = new accc();
	static String t1;
	static String t2;
	static String t3;
	static String t4;
	static String t5;
	static String t6;
	static String t7;
	static String t8;
	static String t9;
	static String tX;
	static boolean bo;
	static DecimalFormat df = new DecimalFormat("0.0000"); 
	public static void main(String[] arguments){
		CardLayout cl1_2 = new CardLayout();
		CardLayout cl1_3 = new CardLayout();
		CardLayout cl1_4 = new CardLayout();
		CardLayout cl2 = new CardLayout();
		CardLayout cl3_1 = new CardLayout();
		CardLayout cl3_2 = new CardLayout();
		
		String gre1_1 = "        欢迎使用ACCC";
		String gre1_2 = "        水（溶液）可载舟，亦可赛艇";
		String gre2 = "        点击\"好的\"按钮继续";
		String gre3 = "        请选择所需的计算的类型";
		String gre4 = "        请选择所需的计算的类别";
		String gre5 = "        请选择所需的计算";
		
		String b = "好的";
		
		String str1[] = {
				"",
				"酸碱滴定",
				"配位滴定",
				"氧化还原滴定"
		};
		String str2_1[] = {
				"",
				"物种的形体分布",
				"溶液的pH计算"
		};
		String str2_2[] = {
				"",
				"副反应系数",
				"单一金属离子滴定的适宜pH范围 "
		};
		String str2_3[] = {
				"",
				"条件电极电势 "
		};
		String str3_1_1[] = {
				"",
				"一元弱酸的分布分数",
				"一元弱碱的分布分数",
				"二元弱酸的分布分数",
				"二元弱碱的分布分数"
		};
		String str3_1_2[] = {
				"",
				"弱酸溶液的pH值",
				"弱碱溶液的pH值",
				"两性物质溶液的pH值"
		};
		String str3_2_1[] = {
				"",
				"酸效应系数",
				"共存离子效应系数",
		};
		String str3_2_2[] = {
				"",
				"最低pH",
				"最高pH",
		};
		String str3_3_1[] = {
				"",
				"没有H+与OH-参与的反应",
				"有H+参与的反应",
				"生成OH-的反应"
				
		};
		
		JTextField f1_1_1_1_1 = new JTextField();
		JTextField f1_1_1_2_1 = new JTextField();
		JTextField f1_1_1_2_2 = new JTextField();
		
		JPanel f1_1_1_1 = new JPanel();
		JPanel f1_1_1_2 = new JPanel();
		JPanel jf1_1_1_1 = new JPanel();
		JPanel jf1_1_1_2 = new JPanel();
		
		f1_1_1_1.setLayout(new GridLayout(0,4));
		f1_1_1_2.setLayout(new GridLayout(0,4));
		jf1_1_1_1.setLayout(new GridLayout(0,2));
		jf1_1_1_2.setLayout(new GridLayout(0,2));
		
		f1_1_1_1.add(f1_1_1_1_1);
		f1_1_1_2.add(f1_1_1_2_1);
		f1_1_1_2.add(new JLabel("*10^"));
		f1_1_1_2.add(f1_1_1_2_2);
		jf1_1_1_1.add(new JPanel());
		jf1_1_1_1.add(f1_1_1_1);
		jf1_1_1_2.add(new JPanel());
		jf1_1_1_2.add(f1_1_1_2);
		
		JTextField f1_1_2_1_1 = new JTextField();
		JTextField f1_1_2_2_1 = new JTextField();
		JTextField f1_1_2_2_2 = new JTextField();
		
		JPanel f1_1_2_1 = new JPanel();
		JPanel f1_1_2_2 = new JPanel();
		JPanel jf1_1_2_1 = new JPanel();
		JPanel jf1_1_2_2 = new JPanel();
		
		f1_1_2_1.setLayout(new GridLayout(0,4));
		f1_1_2_2.setLayout(new GridLayout(0,4));
		jf1_1_2_1.setLayout(new GridLayout(0,2));
		jf1_1_2_2.setLayout(new GridLayout(0,2));
		
		f1_1_2_1.add(f1_1_2_1_1);
		f1_1_2_2.add(f1_1_2_2_1);
		f1_1_2_2.add(new JLabel("*10^"));
		f1_1_2_2.add(f1_1_2_2_2);
		jf1_1_2_1.add(new JPanel());
		jf1_1_2_1.add(f1_1_2_1);
		jf1_1_2_2.add(new JPanel());
		jf1_1_2_2.add(f1_1_2_2);
		
		JTextField f1_1_3_1_1 = new JTextField();
		JTextField f1_1_3_2_1 = new JTextField();
		JTextField f1_1_3_2_2 = new JTextField();
		JTextField f1_1_3_3_1 = new JTextField();
		JTextField f1_1_3_3_2 = new JTextField();
		
		JPanel f1_1_3_1 = new JPanel();
		JPanel f1_1_3_2 = new JPanel();
		JPanel f1_1_3_3 = new JPanel();
		JPanel jf1_1_3_1 = new JPanel();
		JPanel jf1_1_3_2 = new JPanel();
		JPanel jf1_1_3_3 = new JPanel();
		
		f1_1_3_1.setLayout(new GridLayout(0,4));
		f1_1_3_2.setLayout(new GridLayout(0,4));
		f1_1_3_3.setLayout(new GridLayout(0,4));
		jf1_1_3_1.setLayout(new GridLayout(0,2));
		jf1_1_3_2.setLayout(new GridLayout(0,2));
		jf1_1_3_3.setLayout(new GridLayout(0,2));
		
		f1_1_3_1.add(f1_1_3_1_1);
		f1_1_3_2.add(f1_1_3_2_1);
		f1_1_3_2.add(new JLabel("*10^"));
		f1_1_3_2.add(f1_1_3_2_2);
		f1_1_3_3.add(f1_1_3_3_1);
		f1_1_3_3.add(new JLabel("*10^"));
		f1_1_3_3.add(f1_1_3_3_2);
		jf1_1_3_1.add(new JPanel());
		jf1_1_3_1.add(f1_1_3_1);
		jf1_1_3_2.add(new JPanel());
		jf1_1_3_2.add(f1_1_3_2);
		jf1_1_3_3.add(new JPanel());
		jf1_1_3_3.add(f1_1_3_3);
		
		JTextField f1_1_4_1_1 = new JTextField();
		JTextField f1_1_4_2_1 = new JTextField();
		JTextField f1_1_4_2_2 = new JTextField();
		JTextField f1_1_4_3_1 = new JTextField();
		JTextField f1_1_4_3_2 = new JTextField();
		
		JPanel f1_1_4_1 = new JPanel();
		JPanel f1_1_4_2 = new JPanel();
		JPanel f1_1_4_3 = new JPanel();
		JPanel jf1_1_4_1 = new JPanel();
		JPanel jf1_1_4_2 = new JPanel();
		JPanel jf1_1_4_3 = new JPanel();
		
		f1_1_4_1.setLayout(new GridLayout(0,4));
		f1_1_4_2.setLayout(new GridLayout(0,4));
		f1_1_4_3.setLayout(new GridLayout(0,4));
		jf1_1_4_1.setLayout(new GridLayout(0,2));
		jf1_1_4_2.setLayout(new GridLayout(0,2));
		jf1_1_4_3.setLayout(new GridLayout(0,2));
		
		f1_1_4_1.add(f1_1_4_1_1);
		f1_1_4_2.add(f1_1_4_2_1);
		f1_1_4_2.add(new JLabel("*10^"));
		f1_1_4_2.add(f1_1_4_2_2);
		f1_1_4_3.add(f1_1_4_3_1);
		f1_1_4_3.add(new JLabel("*10^"));
		f1_1_4_3.add(f1_1_4_3_2);
		jf1_1_4_1.add(new JPanel());
		jf1_1_4_1.add(f1_1_4_1);
		jf1_1_4_2.add(new JPanel());
		jf1_1_4_2.add(f1_1_4_2);
		jf1_1_4_3.add(new JPanel());
		jf1_1_4_3.add(f1_1_4_3);
		
		JTextField f1_2_1_1_1 = new JTextField();
		JTextField f1_2_1_1_2 = new JTextField();
		JTextField f1_2_1_2_1 = new JTextField();
		JTextField f1_2_1_2_2 = new JTextField();
		
		JPanel f1_2_1_1 = new JPanel();
		JPanel f1_2_1_2 = new JPanel();
		JPanel jf1_2_1_1 = new JPanel();
		JPanel jf1_2_1_2 = new JPanel();
		
		f1_2_1_1.setLayout(new GridLayout(0,4));
		f1_2_1_2.setLayout(new GridLayout(0,4));
		jf1_2_1_1.setLayout(new GridLayout(0,2));
		jf1_2_1_2.setLayout(new GridLayout(0,2));
		
		f1_2_1_1.add(f1_2_1_1_1);
		f1_2_1_1.add(new JLabel("*10^"));
		f1_2_1_1.add(f1_2_1_1_2);
		f1_2_1_1.add(new JLabel("mol/L"));
		f1_2_1_2.add(f1_2_1_2_1);
		f1_2_1_2.add(new JLabel("*10^"));
		f1_2_1_2.add(f1_2_1_2_2);
		jf1_2_1_1.add(new JPanel());
		jf1_2_1_1.add(f1_2_1_1);
		jf1_2_1_2.add(new JPanel());
		jf1_2_1_2.add(f1_2_1_2);
		
		JTextField f1_2_2_1_1 = new JTextField();
		JTextField f1_2_2_1_2 = new JTextField();
		JTextField f1_2_2_2_1 = new JTextField();
		JTextField f1_2_2_2_2 = new JTextField();
		
		JPanel f1_2_2_1 = new JPanel();
		JPanel f1_2_2_2 = new JPanel();
		JPanel jf1_2_2_1 = new JPanel();
		JPanel jf1_2_2_2 = new JPanel();
		
		f1_2_2_1.setLayout(new GridLayout(0,4));
		f1_2_2_2.setLayout(new GridLayout(0,4));
		jf1_2_2_1.setLayout(new GridLayout(0,2));
		jf1_2_2_2.setLayout(new GridLayout(0,2));
		
		f1_2_2_1.add(f1_2_2_1_1);
		f1_2_2_1.add(new JLabel("*10^"));
		f1_2_2_1.add(f1_2_2_1_2);
		f1_2_2_1.add(new JLabel("mol/L"));
		f1_2_2_2.add(f1_2_2_2_1);
		f1_2_2_2.add(new JLabel("*10^"));
		f1_2_2_2.add(f1_2_2_2_2);
		jf1_2_2_1.add(new JPanel());
		jf1_2_2_1.add(f1_2_2_1);
		jf1_2_2_2.add(new JPanel());
		jf1_2_2_2.add(f1_2_2_2);
		
		JTextField f1_2_3_1_1 = new JTextField();
		JTextField f1_2_3_1_2 = new JTextField();
		JTextField f1_2_3_2_1 = new JTextField();
		JTextField f1_2_3_2_2 = new JTextField();
		
		JPanel f1_2_3_1 = new JPanel();
		JPanel f1_2_3_2 = new JPanel();
		JPanel jf1_2_3_1 = new JPanel();
		JPanel jf1_2_3_2 = new JPanel();
		
		f1_2_3_1.setLayout(new GridLayout(0,4));
		f1_2_3_2.setLayout(new GridLayout(0,4));
		jf1_2_3_1.setLayout(new GridLayout(0,2));
		jf1_2_3_2.setLayout(new GridLayout(0,2));
		
		f1_2_3_1.add(f1_2_3_1_1);
		f1_2_3_1.add(new JLabel("*10^"));
		f1_2_3_1.add(f1_2_3_1_2);
		f1_2_3_2.add(f1_2_3_2_1);
		f1_2_3_2.add(new JLabel("*10^"));
		f1_2_3_2.add(f1_2_3_2_2);
		jf1_2_3_1.add(new JPanel());
		jf1_2_3_1.add(f1_2_3_1);
		jf1_2_3_2.add(new JPanel());
		jf1_2_3_2.add(f1_2_3_2);
		
		JTextField f2_1_1_1_1 = new JTextField();
		
		JPanel f2_1_1_1 = new JPanel();
		JPanel jf2_1_1_1 = new JPanel();
		
		f2_1_1_1.setLayout(new GridLayout(0,4));
		jf2_1_1_1.setLayout(new GridLayout(0,2));
		
		f2_1_1_1.add(f2_1_1_1_1);
		jf2_1_1_1.add(new JPanel());
		jf2_1_1_1.add(f2_1_1_1);
		
		JTextField f2_1_2_1_1 = new JTextField();
		JTextField f2_1_2_1_2 = new JTextField();
		JTextField f2_1_2_2_1 = new JTextField();
		JTextField f2_1_2_2_2 = new JTextField();
		
		JPanel f2_1_2_1 = new JPanel();
		JPanel f2_1_2_2 = new JPanel();
		JPanel jf2_1_2_1 = new JPanel();
		JPanel jf2_1_2_2 = new JPanel();
		
		f2_1_2_1.setLayout(new GridLayout(0,4));
		f2_1_2_2.setLayout(new GridLayout(0,4));
		jf2_1_2_1.setLayout(new GridLayout(0,2));
		jf2_1_2_2.setLayout(new GridLayout(0,2));
		
		f2_1_2_1.add(f2_1_2_1_1);
		f2_1_2_1.add(new JLabel("*10^"));
		f2_1_2_1.add(f2_1_2_1_2);
		f2_1_2_2.add(f2_1_2_2_1);
		f2_1_2_2.add(new JLabel("*10^"));
		f2_1_2_2.add(f2_1_2_2_2);
		f2_1_2_2.add(new JLabel("mol/L"));
		jf2_1_2_1.add(new JPanel());
		jf2_1_2_1.add(f2_1_2_1);
		jf2_1_2_2.add(new JPanel());
		jf2_1_2_2.add(f2_1_2_2);
		
		JTextField f2_2_1_1_1 = new JTextField();
		JTextField f2_2_1_1_2 = new JTextField();
		
		JPanel f2_2_1_1 = new JPanel();
		JPanel jf2_2_1_1 = new JPanel();
		
		f2_2_1_1.setLayout(new GridLayout(0,4));
		jf2_2_1_1.setLayout(new GridLayout(0,2));
		
		f2_2_1_1.add(f2_2_1_1_1);
		f2_2_1_1.add(new JLabel("*10^"));
		f2_2_1_1.add(f2_2_1_1_2);
		jf2_2_1_1.add(new JPanel());
		jf2_2_1_1.add(f2_2_1_1);
		
		JTextField f2_2_2_1_1 = new JTextField();
		JTextField f2_2_2_2_1 = new JTextField();
		JTextField f2_2_2_2_2 = new JTextField();
		JTextField f2_2_2_3_1 = new JTextField();
		JTextField f2_2_2_3_2 = new JTextField();
		
		JPanel f2_2_2_1 = new JPanel();
		JPanel f2_2_2_2 = new JPanel();
		JPanel f2_2_2_3 = new JPanel();
		JPanel jf2_2_2_1 = new JPanel();
		JPanel jf2_2_2_2 = new JPanel();
		JPanel jf2_2_2_3 = new JPanel();
		
		f2_2_2_1.setLayout(new GridLayout(0,4));
		f2_2_2_2.setLayout(new GridLayout(0,4));
		f2_2_2_3.setLayout(new GridLayout(0,4));
		jf2_2_2_1.setLayout(new GridLayout(0,2));
		jf2_2_2_2.setLayout(new GridLayout(0,2));
		jf2_2_2_3.setLayout(new GridLayout(0,2));
		
		f2_2_2_1.add(f2_2_2_1_1);
		f2_2_2_2.add(f2_2_2_2_1);
		f2_2_2_2.add(new JLabel("*10^"));
		f2_2_2_2.add(f2_2_2_2_2);
		f2_2_2_3.add(f2_2_2_3_1);
		f2_2_2_3.add(new JLabel("*10^"));
		f2_2_2_3.add(f2_2_2_3_2);
		f2_2_2_3.add(new JLabel("mol/L"));
		jf2_2_2_1.add(new JPanel());
		jf2_2_2_1.add(f2_2_2_1);
		jf2_2_2_2.add(new JPanel());
		jf2_2_2_2.add(f2_2_2_2);
		jf2_2_2_3.add(new JPanel());
		jf2_2_2_3.add(f2_2_2_3);
		
		JTextField f3_1_1_1_1 = new JTextField();
		JTextField f3_1_1_2_1 = new JTextField();
		JTextField f3_1_1_3_1 = new JTextField();
		JTextField f3_1_1_4_1 = new JTextField();
		JTextField f3_1_1_4_2 = new JTextField();
		JTextField f3_1_1_5_1 = new JTextField();
		JTextField f3_1_1_6_1 = new JTextField();
		JTextField f3_1_1_6_2 = new JTextField();
		
		JPanel f3_1_1_1 = new JPanel();
		JPanel f3_1_1_2 = new JPanel();
		JPanel f3_1_1_3 = new JPanel();
		JPanel f3_1_1_4 = new JPanel();
		JPanel f3_1_1_5 = new JPanel();
		JPanel f3_1_1_6 = new JPanel();
		JPanel jf3_1_1_1 = new JPanel();
		JPanel jf3_1_1_2 = new JPanel();
		JPanel jf3_1_1_3 = new JPanel();
		JPanel jf3_1_1_4 = new JPanel();
		JPanel jf3_1_1_5 = new JPanel();
		JPanel jf3_1_1_6 = new JPanel();
		
		f3_1_1_1.setLayout(new GridLayout(0,4));
		f3_1_1_2.setLayout(new GridLayout(0,4));
		f3_1_1_3.setLayout(new GridLayout(0,4));
		f3_1_1_4.setLayout(new GridLayout(0,4));
		f3_1_1_5.setLayout(new GridLayout(0,4));
		f3_1_1_6.setLayout(new GridLayout(0,4));
		jf3_1_1_1.setLayout(new GridLayout(0,2));
		jf3_1_1_2.setLayout(new GridLayout(0,2));
		jf3_1_1_3.setLayout(new GridLayout(0,2));
		jf3_1_1_4.setLayout(new GridLayout(0,2));
		jf3_1_1_5.setLayout(new GridLayout(0,2));
		jf3_1_1_6.setLayout(new GridLayout(0,2));
		
		f3_1_1_1.add(f3_1_1_1_1);
		f3_1_1_2.add(f3_1_1_2_1);
		f3_1_1_3.add(f3_1_1_3_1);
		f3_1_1_4.add(f3_1_1_4_1);
		f3_1_1_4.add(new JLabel("*10^"));
		f3_1_1_4.add(f3_1_1_4_2);
		f3_1_1_4.add(new JLabel("mol/L"));
		f3_1_1_5.add(f3_1_1_5_1);
		f3_1_1_6.add(f3_1_1_6_1);
		f3_1_1_6.add(new JLabel("*10^"));
		f3_1_1_6.add(f3_1_1_6_2);
		f3_1_1_6.add(new JLabel("mol/L"));
		jf3_1_1_1.add(new JLabel("请输入标准电极电势"));
		jf3_1_1_1.add(f3_1_1_1);
		jf3_1_1_2.add(new JLabel("请输入转移的电子数"));
		jf3_1_1_2.add(f3_1_1_2);
		jf3_1_1_3.add(new JPanel());
		jf3_1_1_3.add(f3_1_1_3);
		jf3_1_1_4.add(new JLabel("请输入Ox的浓度"));
		jf3_1_1_4.add(f3_1_1_4);
		jf3_1_1_5.add(new JPanel());
		jf3_1_1_5.add(f3_1_1_5);
		jf3_1_1_6.add(new JLabel("请输入Re的浓度"));
		jf3_1_1_6.add(f3_1_1_6);
		
		JTextField f3_1_2_1_1 = new JTextField();
		JTextField f3_1_2_2_1 = new JTextField();
		JTextField f3_1_2_3_1 = new JTextField();
		JTextField f3_1_2_4_1 = new JTextField();
		JTextField f3_1_2_4_2 = new JTextField();
		JTextField f3_1_2_5_1 = new JTextField();
		JTextField f3_1_2_6_1 = new JTextField();
		JTextField f3_1_2_6_2 = new JTextField();
		JTextField f3_1_2_7_1 = new JTextField();
		JTextField f3_1_2_8_1 = new JTextField();
		
		JPanel f3_1_2_1 = new JPanel();
		JPanel f3_1_2_2 = new JPanel();
		JPanel f3_1_2_3 = new JPanel();
		JPanel f3_1_2_4 = new JPanel();
		JPanel f3_1_2_5 = new JPanel();
		JPanel f3_1_2_6 = new JPanel();
		JPanel f3_1_2_7 = new JPanel();
		JPanel f3_1_2_8 = new JPanel();
		JPanel jf3_1_2_1 = new JPanel();
		JPanel jf3_1_2_2 = new JPanel();
		JPanel jf3_1_2_3 = new JPanel();
		JPanel jf3_1_2_4 = new JPanel();
		JPanel jf3_1_2_5 = new JPanel();
		JPanel jf3_1_2_6 = new JPanel();
		JPanel jf3_1_2_7 = new JPanel();
		JPanel jf3_1_2_8 = new JPanel();
		
		f3_1_2_1.setLayout(new GridLayout(0,4));
		f3_1_2_2.setLayout(new GridLayout(0,4));
		f3_1_2_3.setLayout(new GridLayout(0,4));
		f3_1_2_4.setLayout(new GridLayout(0,4));
		f3_1_2_5.setLayout(new GridLayout(0,4));
		f3_1_2_6.setLayout(new GridLayout(0,4));
		f3_1_2_7.setLayout(new GridLayout(0,4));
		f3_1_2_8.setLayout(new GridLayout(0,4));
		jf3_1_2_1.setLayout(new GridLayout(0,2));
		jf3_1_2_2.setLayout(new GridLayout(0,2));
		jf3_1_2_3.setLayout(new GridLayout(0,2));
		jf3_1_2_4.setLayout(new GridLayout(0,2));
		jf3_1_2_5.setLayout(new GridLayout(0,2));
		jf3_1_2_6.setLayout(new GridLayout(0,2));
		jf3_1_2_7.setLayout(new GridLayout(0,2));
		jf3_1_2_8.setLayout(new GridLayout(0,2));
		
		f3_1_2_1.add(f3_1_2_1_1);
		f3_1_2_2.add(f3_1_2_2_1);
		f3_1_2_3.add(f3_1_2_3_1);
		f3_1_2_4.add(f3_1_2_4_1);
		f3_1_2_4.add(new JLabel("*10^"));
		f3_1_2_4.add(f3_1_2_4_2);
		f3_1_2_4.add(new JLabel("mol/L"));
		f3_1_2_5.add(f3_1_2_5_1);
		f3_1_2_6.add(f3_1_2_6_1);
		f3_1_2_6.add(new JLabel("*10^"));
		f3_1_2_6.add(f3_1_2_6_2);
		f3_1_2_6.add(new JLabel("mol/L"));
		f3_1_2_7.add(f3_1_2_7_1);
		f3_1_2_8.add(f3_1_2_8_1);
		jf3_1_2_1.add(new JLabel("请输入标准电极电势"));
		jf3_1_2_1.add(f3_1_2_1);
		jf3_1_2_2.add(new JLabel("请输入转移的电子数"));
		jf3_1_2_2.add(f3_1_2_2);
		jf3_1_2_3.add(new JPanel());
		jf3_1_2_3.add(f3_1_2_3);
		jf3_1_2_4.add(new JLabel("请输入Ox的浓度"));
		jf3_1_2_4.add(f3_1_2_4);
		jf3_1_2_5.add(new JPanel());
		jf3_1_2_5.add(f3_1_2_5);
		jf3_1_2_6.add(new JLabel("请输入Re的浓度"));
		jf3_1_2_6.add(f3_1_2_6);
		jf3_1_2_7.add(new JPanel());
		jf3_1_2_7.add(f3_1_2_7);
		jf3_1_2_8.add(new JLabel("请输入溶液的pH值"));
		jf3_1_2_8.add(f3_1_2_8);
		
		JTextField f3_1_3_1_1 = new JTextField();
		JTextField f3_1_3_2_1 = new JTextField();
		JTextField f3_1_3_3_1 = new JTextField();
		JTextField f3_1_3_4_1 = new JTextField();
		JTextField f3_1_3_4_2 = new JTextField();
		JTextField f3_1_3_5_1 = new JTextField();
		JTextField f3_1_3_6_1 = new JTextField();
		JTextField f3_1_3_6_2 = new JTextField();
		JTextField f3_1_3_7_1 = new JTextField();
		JTextField f3_1_3_8_1 = new JTextField();
		
		JPanel f3_1_3_1 = new JPanel();
		JPanel f3_1_3_2 = new JPanel();
		JPanel f3_1_3_3 = new JPanel();
		JPanel f3_1_3_4 = new JPanel();
		JPanel f3_1_3_5 = new JPanel();
		JPanel f3_1_3_6 = new JPanel();
		JPanel f3_1_3_7 = new JPanel();
		JPanel f3_1_3_8 = new JPanel();
		JPanel jf3_1_3_1 = new JPanel();
		JPanel jf3_1_3_2 = new JPanel();
		JPanel jf3_1_3_3 = new JPanel();
		JPanel jf3_1_3_4 = new JPanel();
		JPanel jf3_1_3_5 = new JPanel();
		JPanel jf3_1_3_6 = new JPanel();
		JPanel jf3_1_3_7 = new JPanel();
		JPanel jf3_1_3_8 = new JPanel();
		
		f3_1_3_1.setLayout(new GridLayout(0,4));
		f3_1_3_2.setLayout(new GridLayout(0,4));
		f3_1_3_3.setLayout(new GridLayout(0,4));
		f3_1_3_4.setLayout(new GridLayout(0,4));
		f3_1_3_5.setLayout(new GridLayout(0,4));
		f3_1_3_6.setLayout(new GridLayout(0,4));
		f3_1_3_7.setLayout(new GridLayout(0,4));
		f3_1_3_8.setLayout(new GridLayout(0,4));
		jf3_1_3_1.setLayout(new GridLayout(0,2));
		jf3_1_3_2.setLayout(new GridLayout(0,2));
		jf3_1_3_3.setLayout(new GridLayout(0,2));
		jf3_1_3_4.setLayout(new GridLayout(0,2));
		jf3_1_3_5.setLayout(new GridLayout(0,2));
		jf3_1_3_6.setLayout(new GridLayout(0,2));
		jf3_1_3_7.setLayout(new GridLayout(0,2));
		jf3_1_3_8.setLayout(new GridLayout(0,2));
		
		f3_1_3_1.add(f3_1_3_1_1);
		f3_1_3_2.add(f3_1_3_2_1);
		f3_1_3_3.add(f3_1_3_3_1);
		f3_1_3_4.add(f3_1_3_4_1);
		f3_1_3_4.add(new JLabel("*10^"));
		f3_1_3_4.add(f3_1_3_4_2);
		f3_1_3_4.add(new JLabel("mol/L"));
		f3_1_3_5.add(f3_1_3_5_1);
		f3_1_3_6.add(f3_1_3_6_1);
		f3_1_3_6.add(new JLabel("*10^"));
		f3_1_3_6.add(f3_1_3_6_2);
		f3_1_3_6.add(new JLabel("mol/L"));
		f3_1_3_7.add(f3_1_3_7_1);
		f3_1_3_8.add(f3_1_3_8_1);
		jf3_1_3_1.add(new JLabel("请输入标准电极电势"));
		jf3_1_3_1.add(f3_1_3_1);
		jf3_1_3_2.add(new JLabel("请输入转移的电子数"));
		jf3_1_3_2.add(f3_1_3_2);
		jf3_1_3_3.add(new JPanel());
		jf3_1_3_3.add(f3_1_3_3);
		jf3_1_3_4.add(new JLabel("请输入Ox的浓度"));
		jf3_1_3_4.add(f3_1_3_4);
		jf3_1_3_5.add(new JPanel());
		jf3_1_3_5.add(f3_1_3_5);
		jf3_1_3_6.add(new JLabel("请输入Re的浓度"));
		jf3_1_3_6.add(f3_1_3_6);
		jf3_1_3_7.add(new JPanel());
		jf3_1_3_7.add(f3_1_3_7);
		jf3_1_3_8.add(new JLabel("请输入溶液的pH值"));
		jf3_1_3_8.add(f3_1_3_8);
		
		JTextField op1_1_1_1_1 = new JTextField();
		JTextField op1_1_1_2_1 = new JTextField();
		op1_1_1_1_1.setEditable(false);
		op1_1_1_2_1.setEditable(false);
		
		JPanel op1_1_1_1 = new JPanel();
		JPanel op1_1_1_2 = new JPanel();
		JPanel jop1_1_1_1 = new JPanel();
		JPanel jop1_1_1_2 = new JPanel();
		
		op1_1_1_1.setLayout(new GridLayout(0,2));
		op1_1_1_2.setLayout(new GridLayout(0,2));
		jop1_1_1_1.setLayout(new GridLayout(0,2));
		jop1_1_1_2.setLayout(new GridLayout(0,2));
		
		op1_1_1_1.add(op1_1_1_1_1);
		op1_1_1_2.add(op1_1_1_2_1);
		jop1_1_1_1.add(new JPanel());
		jop1_1_1_1.add(op1_1_1_1);
		jop1_1_1_2.add(new JPanel());
		jop1_1_1_2.add(op1_1_1_2);
		
		JTextField op1_1_2_1_1 = new JTextField();
		JTextField op1_1_2_2_1 = new JTextField();
		op1_1_2_1_1.setEditable(false);
		op1_1_2_2_1.setEditable(false);
		
		JPanel op1_1_2_1 = new JPanel();
		JPanel op1_1_2_2 = new JPanel();
		JPanel jop1_1_2_1 = new JPanel();
		JPanel jop1_1_2_2 = new JPanel();
		
		op1_1_2_1.setLayout(new GridLayout(0,2));
		op1_1_2_2.setLayout(new GridLayout(0,2));
		jop1_1_2_1.setLayout(new GridLayout(0,2));
		jop1_1_2_2.setLayout(new GridLayout(0,2));
		
		op1_1_2_1.add(op1_1_2_1_1);
		op1_1_2_2.add(op1_1_2_2_1);
		jop1_1_2_1.add(new JPanel());
		jop1_1_2_1.add(op1_1_2_1);
		jop1_1_2_2.add(new JPanel());
		jop1_1_2_2.add(op1_1_2_2);
		
		JTextField op1_1_3_1_1 = new JTextField();
		JTextField op1_1_3_2_1 = new JTextField();
		JTextField op1_1_3_3_1 = new JTextField();
		op1_1_3_1_1.setEditable(false);
		op1_1_3_2_1.setEditable(false);
		op1_1_3_3_1.setEditable(false);
		
		JPanel op1_1_3_1 = new JPanel();
		JPanel op1_1_3_2 = new JPanel();
		JPanel op1_1_3_3 = new JPanel();
		JPanel jop1_1_3_1 = new JPanel();
		JPanel jop1_1_3_2 = new JPanel();
		JPanel jop1_1_3_3 = new JPanel();
		
		op1_1_3_1.setLayout(new GridLayout(0,2));
		op1_1_3_2.setLayout(new GridLayout(0,2));
		op1_1_3_3.setLayout(new GridLayout(0,2));
		jop1_1_3_1.setLayout(new GridLayout(0,2));
		jop1_1_3_2.setLayout(new GridLayout(0,2));
		jop1_1_3_3.setLayout(new GridLayout(0,2));
		
		op1_1_3_1.add(op1_1_3_1_1);
		op1_1_3_2.add(op1_1_3_2_1);
		op1_1_3_3.add(op1_1_3_3_1);
		jop1_1_3_1.add(new JPanel());
		jop1_1_3_1.add(op1_1_3_1);
		jop1_1_3_2.add(new JPanel());
		jop1_1_3_2.add(op1_1_3_2);
		jop1_1_3_3.add(new JPanel());
		jop1_1_3_3.add(op1_1_3_3);
		
		JTextField op1_1_4_1_1 = new JTextField();
		JTextField op1_1_4_2_1 = new JTextField();
		JTextField op1_1_4_3_1 = new JTextField();
		op1_1_4_1_1.setEditable(false);
		op1_1_4_2_1.setEditable(false);
		op1_1_4_3_1.setEditable(false);
		
		JPanel op1_1_4_1 = new JPanel();
		JPanel op1_1_4_2 = new JPanel();
		JPanel op1_1_4_3 = new JPanel();
		JPanel jop1_1_4_1 = new JPanel();
		JPanel jop1_1_4_2 = new JPanel();
		JPanel jop1_1_4_3 = new JPanel();
		
		op1_1_4_1.setLayout(new GridLayout(0,2));
		op1_1_4_2.setLayout(new GridLayout(0,2));
		op1_1_4_3.setLayout(new GridLayout(0,2));
		jop1_1_4_1.setLayout(new GridLayout(0,2));
		jop1_1_4_2.setLayout(new GridLayout(0,2));
		jop1_1_4_3.setLayout(new GridLayout(0,2));
		
		op1_1_4_1.add(op1_1_4_1_1);
		op1_1_4_2.add(op1_1_4_2_1);
		op1_1_4_3.add(op1_1_4_3_1);
		jop1_1_4_1.add(new JPanel());
		jop1_1_4_1.add(op1_1_4_1);
		jop1_1_4_2.add(new JPanel());
		jop1_1_4_2.add(op1_1_4_2);
		jop1_1_4_3.add(new JPanel());
		jop1_1_4_3.add(op1_1_4_3);
		
		JTextField op1_2_1_1_1 = new JTextField();
		JTextField op1_2_1_2_1 = new JTextField();
		op1_2_1_1_1.setEditable(false);
		op1_2_1_2_1.setEditable(false);
		
		JPanel op1_2_1_1 = new JPanel();
		JPanel op1_2_1_2 = new JPanel();
		JPanel jop1_2_1_1 = new JPanel();
		JPanel jop1_2_1_2 = new JPanel();
		
		op1_2_1_1.setLayout(new GridLayout(0,1));
		op1_2_1_2.setLayout(new GridLayout(0,2));
		jop1_2_1_1.setLayout(new GridLayout(0,2));
		jop1_2_1_2.setLayout(new GridLayout(0,2));
		
		op1_2_1_1.add(op1_2_1_1_1);
		op1_2_1_2.add(op1_2_1_2_1);
		jop1_2_1_1.add(new JPanel());
		jop1_2_1_1.add(op1_2_1_1);
		jop1_2_1_2.add(new JPanel());
		jop1_2_1_2.add(op1_2_1_2);
		
		JTextField op1_2_2_1_1 = new JTextField();
		JTextField op1_2_2_2_1 = new JTextField();
		op1_2_2_1_1.setEditable(false);
		op1_2_2_2_1.setEditable(false);
		
		JPanel op1_2_2_1 = new JPanel();
		JPanel op1_2_2_2 = new JPanel();
		JPanel jop1_2_2_1 = new JPanel();
		JPanel jop1_2_2_2 = new JPanel();
		
		op1_2_2_1.setLayout(new GridLayout(0,1));
		op1_2_2_2.setLayout(new GridLayout(0,2));
		jop1_2_2_1.setLayout(new GridLayout(0,2));
		jop1_2_2_2.setLayout(new GridLayout(0,2));
		
		op1_2_2_1.add(op1_2_2_1_1);
		op1_2_2_2.add(op1_2_2_2_1);
		jop1_2_2_1.add(new JPanel());
		jop1_2_2_1.add(op1_2_2_1);
		jop1_2_2_2.add(new JPanel());
		jop1_2_2_2.add(op1_2_2_2);
		
		JTextField op1_2_3_1_1 = new JTextField();
		JTextField op1_2_3_2_1 = new JTextField();
		op1_2_3_1_1.setEditable(false);
		op1_2_3_2_1.setEditable(false);
		
		JPanel op1_2_3_1 = new JPanel();
		JPanel op1_2_3_2 = new JPanel();
		JPanel jop1_2_3_1 = new JPanel();
		JPanel jop1_2_3_2 = new JPanel();
		
		op1_2_3_1.setLayout(new GridLayout(0,1));
		op1_2_3_2.setLayout(new GridLayout(0,2));
		jop1_2_3_1.setLayout(new GridLayout(0,2));
		jop1_2_3_2.setLayout(new GridLayout(0,2));
		
		op1_2_3_1.add(op1_2_3_1_1);
		op1_2_3_2.add(op1_2_3_2_1);
		jop1_2_3_1.add(new JPanel());
		jop1_2_3_1.add(op1_2_3_1);
		jop1_2_3_2.add(new JPanel());
		jop1_2_3_2.add(op1_2_3_2);
		
		JTextField op2_1_1_1_1 = new JTextField();
		JTextField op2_1_1_2_1 = new JTextField();
		op2_1_1_1_1.setEditable(false);
		op2_1_1_2_1.setEditable(false);
		
		JPanel op2_1_1_1 = new JPanel();
		JPanel op2_1_1_2 = new JPanel();
		JPanel jop2_1_1_1 = new JPanel();
		JPanel jop2_1_1_2 = new JPanel();
		
		op2_1_1_1.setLayout(new GridLayout(0,1));
		op2_1_1_2.setLayout(new GridLayout(0,2));
		jop2_1_1_1.setLayout(new GridLayout(0,2));
		jop2_1_1_2.setLayout(new GridLayout(0,2));
		
		op2_1_1_1.add(op2_1_1_1_1);
		op2_1_1_2.add(op2_1_1_2_1);
		jop2_1_1_1.add(new JPanel());
		jop2_1_1_1.add(op2_1_1_1);
		jop2_1_1_2.add(new JPanel());
		jop2_1_1_2.add(op2_1_1_2);
		
		JTextField op2_1_2_1_1 = new JTextField();
		JTextField op2_1_2_2_1 = new JTextField();
		op2_1_2_1_1.setEditable(false);
		op2_1_2_2_1.setEditable(false);
		
		JPanel op2_1_2_1 = new JPanel();
		JPanel op2_1_2_2 = new JPanel();
		JPanel jop2_1_2_1 = new JPanel();
		JPanel jop2_1_2_2 = new JPanel();
		
		op2_1_2_1.setLayout(new GridLayout(0,1));
		op2_1_2_2.setLayout(new GridLayout(0,2));
		jop2_1_2_1.setLayout(new GridLayout(0,2));
		jop2_1_2_2.setLayout(new GridLayout(0,2));
		
		op2_1_2_1.add(op2_1_2_1_1);
		op2_1_2_2.add(op2_1_2_2_1);
		jop2_1_2_1.add(new JPanel());
		jop2_1_2_1.add(op2_1_2_1);
		jop2_1_2_2.add(new JPanel());
		jop2_1_2_2.add(op2_1_2_2);
		
		JTextField op2_2_1_1_1 = new JTextField();
		op2_2_1_1_1.setEditable(false);
		
		JPanel op2_2_1_1 = new JPanel();
		JPanel jop2_2_1_1 = new JPanel();
		
		op2_2_1_1.setLayout(new GridLayout(0,2));
		jop2_2_1_1.setLayout(new GridLayout(0,2));
		
		op2_2_1_1.add(op2_2_1_1_1);
		jop2_2_1_1.add(new JPanel());
		jop2_2_1_1.add(op2_2_1_1);
		
		JTextField op2_2_2_1_1 = new JTextField();
		op2_2_2_1_1.setEditable(false);
		
		JPanel op2_2_2_1 = new JPanel();
		JPanel jop2_2_2_1 = new JPanel();
		
		op2_2_2_1.setLayout(new GridLayout(0,2));
		jop2_2_2_1.setLayout(new GridLayout(0,2));
		
		op2_2_2_1.add(op2_2_2_1_1);
		jop2_2_2_1.add(new JPanel());
		jop2_2_2_1.add(op2_2_2_1);
		
		JTextField op3_1_1_1_1 = new JTextField();
		op3_1_1_1_1.setEditable(false);
		
		JPanel op3_1_1_1 = new JPanel();
		JPanel jop3_1_1_1 = new JPanel();
		
		op3_1_1_1.setLayout(new GridLayout(0,2));
		jop3_1_1_1.setLayout(new GridLayout(0,2));
		
		op3_1_1_1.add(op3_1_1_1_1);
		jop3_1_1_1.add(new JPanel());
		jop3_1_1_1.add(op3_1_1_1);
		
		JTextField op3_1_2_1_1 = new JTextField();
		op3_1_2_1_1.setEditable(false);
		
		JPanel op3_1_2_1 = new JPanel();
		JPanel jop3_1_2_1 = new JPanel();
		
		op3_1_2_1.setLayout(new GridLayout(0,2));
		jop3_1_2_1.setLayout(new GridLayout(0,2));
		
		op3_1_2_1.add(op3_1_2_1_1);
		jop3_1_2_1.add(new JPanel());
		jop3_1_2_1.add(op3_1_2_1);
		
		JTextField op3_1_3_1_1 = new JTextField();
		op3_1_3_1_1.setEditable(false);
		
		JPanel op3_1_3_1 = new JPanel();
		JPanel jop3_1_3_1 = new JPanel();
		
		op3_1_3_1.setLayout(new GridLayout(0,2));
		jop3_1_3_1.setLayout(new GridLayout(0,2));
		
		op3_1_3_1.add(op3_1_3_1_1);
		jop3_1_3_1.add(new JPanel());
		jop3_1_3_1.add(op3_1_3_1);
		
		JComboBox<Object> cb1 = new JComboBox<Object>(str1);
		JComboBox<Object> cb2_1 = new JComboBox<Object>(str2_1);
		JComboBox<Object> cb2_2 = new JComboBox<Object>(str2_2);
		JComboBox<Object> cb2_3 = new JComboBox<Object>(str2_3);
		JComboBox<Object> cb3_1_1 = new JComboBox<Object>(str3_1_1);
		JComboBox<Object> cb3_1_2 = new JComboBox<Object>(str3_1_2);
		JComboBox<Object> cb3_2_1 = new JComboBox<Object>(str3_2_1);
		JComboBox<Object> cb3_2_2 = new JComboBox<Object>(str3_2_2);
		JComboBox<Object> cb3_3_1 = new JComboBox<Object>(str3_3_1);
		
		JPanel jcb1 = new JPanel();
		JPanel jcb2_1 = new JPanel();
		JPanel jcb2_2 = new JPanel();
		JPanel jcb2_3 = new JPanel();
		JPanel jcb3_1_1 = new JPanel();
		JPanel jcb3_1_2 = new JPanel();
		JPanel jcb3_2_1 = new JPanel();
		JPanel jcb3_2_2 = new JPanel();
		JPanel jcb3_3_1 = new JPanel();
		
		jcb1.add(cb1);
		jcb2_1.add(cb2_1);
		jcb2_2.add(cb2_2);
		jcb2_3.add(cb2_3);
		jcb3_1_1.add(cb3_1_1);
		jcb3_1_2.add(cb3_1_2);
		jcb3_2_1.add(cb3_2_1);
		jcb3_2_2.add(cb3_2_2);
		jcb3_3_1.add(cb3_3_1);
		
		JButton b1 = new JButton(b);
		JButton b2 = new JButton(b);
		JButton b3_1 = new JButton(b);
		JButton b3_2 = new JButton(b);
		JButton b3_3 = new JButton(b);
		JButton b4_1_1 = new JButton(b);
		JButton b4_1_2 = new JButton(b);
		JButton b4_2_1 = new JButton(b);
		JButton b4_2_2 = new JButton(b);
		JButton b4_3_1 = new JButton(b);
		JButton b5_1_1_1 = new JButton(b);
		JButton b5_1_1_2 = new JButton(b);
		JButton b5_1_1_3 = new JButton(b);
		JButton b5_1_1_4 = new JButton(b);
		JButton b5_1_2_1 = new JButton(b);
		JButton b5_1_2_2 = new JButton(b);
		JButton b5_1_2_3 = new JButton(b);
		JButton b5_2_1_1 = new JButton(b);
		JButton b5_2_1_2 = new JButton(b);
		JButton b5_2_2_1 = new JButton(b);
		JButton b5_2_2_2 = new JButton(b);
		JButton b5_3_1_1 = new JButton(b);
		JButton b5_3_1_2 = new JButton(b);
		JButton b5_3_1_3 = new JButton(b);
		JButton b6_1 = new JButton(b);
		JButton b6_2 = new JButton("+1s");
		JButton b6_3 = new JButton("退出");
		
		JPanel jb1 = new JPanel();
		JPanel jb2 = new JPanel();
		JPanel jb3_1 = new JPanel();
		JPanel jb3_2 = new JPanel();
		JPanel jb3_3 = new JPanel();
		JPanel jb4_1_1 = new JPanel();
		JPanel jb4_1_2 = new JPanel();
		JPanel jb4_2_1 = new JPanel();
		JPanel jb4_2_2 = new JPanel();
		JPanel jb4_3_1 = new JPanel();
		JPanel jb5_1_1_1 = new JPanel();
		JPanel jb5_1_1_2 = new JPanel();
		JPanel jb5_1_1_3 = new JPanel();
		JPanel jb5_1_1_4 = new JPanel();
		JPanel jb5_1_2_1 = new JPanel();
		JPanel jb5_1_2_2 = new JPanel();
		JPanel jb5_1_2_3 = new JPanel();
		JPanel jb5_2_1_1 = new JPanel();
		JPanel jb5_2_1_2 = new JPanel();
		JPanel jb5_2_2_1 = new JPanel();
		JPanel jb5_2_2_2 = new JPanel();
		JPanel jb5_3_1_1 = new JPanel();
		JPanel jb5_3_1_2 = new JPanel();
		JPanel jb5_3_1_3 = new JPanel();
		JPanel jb6_1 = new JPanel();
		JPanel jb6_2 = new JPanel();
		JPanel jb6_3 = new JPanel();
		
		jb1.setLayout(new GridLayout(0,4));
		jb1.add(new JPanel());
		jb1.add(new JPanel());
		jb1.add(b1);
		jb2.setLayout(new GridLayout(0,4));
		jb2.add(new JPanel());
		jb2.add(new JPanel());
		jb2.add(b2);
		jb3_1.setLayout(new GridLayout(0,4));
		jb3_1.add(new JPanel());
		jb3_1.add(new JPanel());
		jb3_1.add(b3_1);
		jb3_2.setLayout(new GridLayout(0,4));
		jb3_2.add(new JPanel());
		jb3_2.add(new JPanel());
		jb3_2.add(b3_2);
		jb3_3.setLayout(new GridLayout(0,4));
		jb3_3.add(new JPanel());
		jb3_3.add(new JPanel());
		jb3_3.add(b3_3);
		jb4_1_1.setLayout(new GridLayout(0,4));
		jb4_1_1.add(new JPanel());
		jb4_1_1.add(new JPanel());
		jb4_1_1.add(b4_1_1);
		jb4_1_2.setLayout(new GridLayout(0,4));
		jb4_1_2.add(new JPanel());
		jb4_1_2.add(new JPanel());
		jb4_1_2.add(b4_1_2);
		jb4_2_1.setLayout(new GridLayout(0,4));
		jb4_2_1.add(new JPanel());
		jb4_2_1.add(new JPanel());
		jb4_2_1.add(b4_2_1);
		jb4_2_2.setLayout(new GridLayout(0,4));
		jb4_2_2.add(new JPanel());
		jb4_2_2.add(new JPanel());
		jb4_2_2.add(b4_2_2);
		jb4_3_1.setLayout(new GridLayout(0,4));
		jb4_3_1.add(new JPanel());
		jb4_3_1.add(new JPanel());
		jb4_3_1.add(b4_3_1);
		jb5_1_1_1.setLayout(new GridLayout(0,4));
		jb5_1_1_1.add(new JPanel());
		jb5_1_1_1.add(new JPanel());
		jb5_1_1_1.add(b5_1_1_1);
		jb5_1_1_2.setLayout(new GridLayout(0,4));
		jb5_1_1_2.add(new JPanel());
		jb5_1_1_2.add(new JPanel());
		jb5_1_1_2.add(b5_1_1_2);
		jb5_1_1_3.setLayout(new GridLayout(0,4));
		jb5_1_1_3.add(new JPanel());
		jb5_1_1_3.add(new JPanel());
		jb5_1_1_3.add(b5_1_1_3);
		jb5_1_1_4.setLayout(new GridLayout(0,4));
		jb5_1_1_4.add(new JPanel());
		jb5_1_1_4.add(new JPanel());
		jb5_1_1_4.add(b5_1_1_4);
		jb5_1_2_1.setLayout(new GridLayout(0,4));
		jb5_1_2_1.add(new JPanel());
		jb5_1_2_1.add(new JPanel());
		jb5_1_2_1.add(b5_1_2_1);
		jb5_1_2_2.setLayout(new GridLayout(0,4));
		jb5_1_2_2.add(new JPanel());
		jb5_1_2_2.add(new JPanel());
		jb5_1_2_2.add(b5_1_2_2);
		jb5_1_2_3.setLayout(new GridLayout(0,4));
		jb5_1_2_3.add(new JPanel());
		jb5_1_2_3.add(new JPanel());
		jb5_1_2_3.add(b5_1_2_3);
		jb5_2_1_1.setLayout(new GridLayout(0,4));
		jb5_2_1_1.add(new JPanel());
		jb5_2_1_1.add(new JPanel());
		jb5_2_1_1.add(b5_2_1_1);
		jb5_2_1_2.setLayout(new GridLayout(0,4));
		jb5_2_1_2.add(new JPanel());
		jb5_2_1_2.add(new JPanel());
		jb5_2_1_2.add(b5_2_1_2);
		jb5_2_2_1.setLayout(new GridLayout(0,4));
		jb5_2_2_1.add(new JPanel());
		jb5_2_2_1.add(new JPanel());
		jb5_2_2_1.add(b5_2_2_1);
		jb5_2_2_2.setLayout(new GridLayout(0,4));
		jb5_2_2_2.add(new JPanel());
		jb5_2_2_2.add(new JPanel());
		jb5_2_2_2.add(b5_2_2_2);
		jb5_3_1_1.setLayout(new GridLayout(0,4));
		jb5_3_1_1.add(new JPanel());
		jb5_3_1_1.add(new JPanel());
		jb5_3_1_1.add(b5_3_1_1);
		jb5_3_1_2.setLayout(new GridLayout(0,4));
		jb5_3_1_2.add(new JPanel());
		jb5_3_1_2.add(new JPanel());
		jb5_3_1_2.add(b5_3_1_2);
		jb5_3_1_3.setLayout(new GridLayout(0,4));
		jb5_3_1_3.add(new JPanel());
		jb5_3_1_3.add(new JPanel());
		jb5_3_1_3.add(b5_3_1_3);
		jb6_1.setLayout(new GridLayout(0,4));
		jb6_1.add(new JPanel());
		jb6_1.add(new JPanel());
		jb6_1.add(b6_1);
		jb6_2.setLayout(new GridLayout(0,4));
		jb6_2.add(new JPanel());
		jb6_2.add(new JPanel());
		jb6_2.add(b6_2);
		jb6_3.setLayout(new GridLayout(0,4));
		jb6_3.add(new JPanel());
		jb6_3.add(new JPanel());
		jb6_3.add(b6_3);
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		
		JPanel jp1_1 = new JPanel();
		JPanel jp1_2 = new JPanel();
		JPanel jp1_3 = new JPanel();
		JPanel jp1_4 = new JPanel();
		
		JPanel jp2_1_1_1 = new JPanel();
		JPanel jp2_1_1_2 = new JPanel();
		JPanel jp2_1_1_3 = new JPanel();
		JPanel jp2_1_1_4 = new JPanel();
		JPanel jp2_1_2_1 = new JPanel();
		JPanel jp2_1_2_2 = new JPanel();
		JPanel jp2_1_2_3 = new JPanel();
		JPanel jp2_2_1_1 = new JPanel();
		JPanel jp2_2_1_2 = new JPanel();
		JPanel jp2_2_2_1 = new JPanel();
		JPanel jp2_2_2_2 = new JPanel();
		JPanel jp2_3_1_1 = new JPanel();
		JPanel jp2_3_1_2 = new JPanel();
		JPanel jp2_3_1_3 = new JPanel();
		
		JPanel jp3_1 = new JPanel();
		JPanel jp3_2 = new JPanel();
		
		JPanel jp1_2_1 = new JPanel();
		JPanel jp1_3_1 = new JPanel();
		JPanel jp1_3_2 = new JPanel();
		JPanel jp1_3_3 = new JPanel();
		JPanel jp1_4_1_1 = new JPanel();
		JPanel jp1_4_1_2 = new JPanel();
		JPanel jp1_4_2_1 = new JPanel();
		JPanel jp1_4_2_2 = new JPanel();
		JPanel jp1_4_3_1 = new JPanel();
		
		JPanel jp3_1_err = new JPanel();
		JPanel jp3_1_1_1_1 = new JPanel();
		JPanel jp3_1_1_1_2 = new JPanel();
		JPanel jp3_1_1_1_3 = new JPanel();
		JPanel jp3_1_1_1_4 = new JPanel();
		JPanel jp3_1_1_2_1 = new JPanel();
		JPanel jp3_1_1_2_2 = new JPanel();
		JPanel jp3_1_1_2_3 = new JPanel();
		JPanel jp3_1_2_1_1 = new JPanel();
		JPanel jp3_1_2_1_2 = new JPanel();
		JPanel jp3_1_2_2_1 = new JPanel();
		JPanel jp3_1_2_2_2 = new JPanel();
		JPanel jp3_1_3_1_1 = new JPanel();
		JPanel jp3_1_3_1_2 = new JPanel();
		JPanel jp3_1_3_1_3 = new JPanel();
		
		jp1.setLayout(new GridLayout(4,1));
		jp2.setLayout(new GridLayout(1,1));
		jp3.setLayout(new GridLayout(2,1));
		
		jp1_1.setLayout(new GridLayout(4,1));
		
		jp1_2_1.setLayout(new GridLayout(4,1));
		jp1_3_1.setLayout(new GridLayout(4,1));
		jp1_3_2.setLayout(new GridLayout(4,1));
		jp1_3_3.setLayout(new GridLayout(4,1));
		jp1_4_1_1.setLayout(new GridLayout(4,1));
		jp1_4_1_2.setLayout(new GridLayout(4,1));
		jp1_4_2_1.setLayout(new GridLayout(4,1));
		jp1_4_2_2.setLayout(new GridLayout(4,1));
		jp1_4_3_1.setLayout(new GridLayout(4,1));
		
		jp2_1_1_1.setLayout(new GridLayout(16,1));
		jp2_1_1_2.setLayout(new GridLayout(16,1));
		jp2_1_1_3.setLayout(new GridLayout(16,1));
		jp2_1_1_4.setLayout(new GridLayout(16,1));
		jp2_1_2_1.setLayout(new GridLayout(16,1));
		jp2_1_2_2.setLayout(new GridLayout(16,1));
		jp2_1_2_3.setLayout(new GridLayout(16,1));
		jp2_2_1_1.setLayout(new GridLayout(16,1));
		jp2_2_1_2.setLayout(new GridLayout(16,1));
		jp2_2_2_1.setLayout(new GridLayout(16,1));
		jp2_2_2_2.setLayout(new GridLayout(16,1));
		jp2_3_1_1.setLayout(new GridLayout(16,1));
		jp2_3_1_2.setLayout(new GridLayout(16,1));
		jp2_3_1_3.setLayout(new GridLayout(16,1));
		
		jp3_1_err.setLayout(new GridLayout(8,1));
		jp3_1_1_1_1.setLayout(new GridLayout(8,1));
		jp3_1_1_1_2.setLayout(new GridLayout(8,1));
		jp3_1_1_1_3.setLayout(new GridLayout(8,1));
		jp3_1_1_1_4.setLayout(new GridLayout(8,1));
		jp3_1_1_2_1.setLayout(new GridLayout(8,1));
		jp3_1_1_2_2.setLayout(new GridLayout(8,1));
		jp3_1_1_2_3.setLayout(new GridLayout(8,1));
		jp3_1_2_1_1.setLayout(new GridLayout(8,1));
		jp3_1_2_1_2.setLayout(new GridLayout(8,1));
		jp3_1_2_2_1.setLayout(new GridLayout(8,1));
		jp3_1_2_2_2.setLayout(new GridLayout(8,1));
		jp3_1_3_1_1.setLayout(new GridLayout(8,1));
		jp3_1_3_1_2.setLayout(new GridLayout(8,1));
		jp3_1_3_1_3.setLayout(new GridLayout(8,1));
		
		jp1_2.setLayout(cl1_2);
		jp1_3.setLayout(cl1_3);
		jp1_4.setLayout(cl1_4);
		
		jp2.setLayout(cl2);
		
		jp3_1.setLayout(cl3_1);
		jp3_2.setLayout(cl3_2);
		
		jp1_1.add(new JLabel(gre1_1));
		jp1_1.add(new JLabel(gre1_2));
		jp1_1.add(new JLabel(gre2));
		jp1_1.add(jb1);
		
		jp1_2_1.add(new JLabel(gre3));
		jp1_2_1.add(jcb1);
		jp1_2_1.add(new JLabel(gre2));
		jp1_2_1.add(jb2);
		
		jp1_2.add(new JPanel(), "0");
		jp1_2.add(jp1_2_1, "1");
		
		jp1_3_1.add(new JLabel(gre4));
		jp1_3_1.add(jcb2_1);
		jp1_3_1.add(new JLabel(gre2));
		jp1_3_1.add(jb3_1);
		
		jp1_3_2.add(new JLabel(gre4));
		jp1_3_2.add(jcb2_2);
		jp1_3_2.add(new JLabel(gre2));
		jp1_3_2.add(jb3_2);
		
		jp1_3_3.add(new JLabel(gre4));
		jp1_3_3.add(jcb2_3);
		jp1_3_3.add(new JLabel(gre2));
		jp1_3_3.add(jb3_3);
		
		jp1_3.add(new JPanel(), str1[0]);
		jp1_3.add(jp1_3_1, str1[1]);
		jp1_3.add(jp1_3_2, str1[2]);
		jp1_3.add(jp1_3_3, str1[3]);
		
		jp1_4_1_1.add(new JLabel(gre5));
		jp1_4_1_1.add(jcb3_1_1);
		jp1_4_1_1.add(new JLabel(gre2));
		jp1_4_1_1.add(jb4_1_1);
		
		jp1_4_1_2.add(new JLabel(gre5));
		jp1_4_1_2.add(jcb3_1_2);
		jp1_4_1_2.add(new JLabel(gre2));
		jp1_4_1_2.add(jb4_1_2);
		
		jp1_4_2_1.add(new JLabel(gre5));
		jp1_4_2_1.add(jcb3_2_1);
		jp1_4_2_1.add(new JLabel(gre2));
		jp1_4_2_1.add(jb4_2_1);
		
		jp1_4_2_2.add(new JLabel(gre5));
		jp1_4_2_2.add(jcb3_2_2);
		jp1_4_2_2.add(new JLabel(gre2));
		jp1_4_2_2.add(jb4_2_2);
		
		jp1_4_3_1.add(new JLabel(gre5));
		jp1_4_3_1.add(jcb3_3_1);
		jp1_4_3_1.add(new JLabel(gre2));
		jp1_4_3_1.add(jb4_3_1);
		
		jp1_4.add(new JPanel(), str2_1[0]);
		jp1_4.add(jp1_4_1_1, str2_1[1]);
		jp1_4.add(jp1_4_1_2, str2_1[2]);
		jp1_4.add(jp1_4_2_1, str2_2[1]);
		jp1_4.add(jp1_4_2_2, str2_2[2]);
		jp1_4.add(jp1_4_3_1, str2_3[1]);
		
		jp1.add(jp1_1);
		jp1.add(jp1_2);
		jp1.add(jp1_3);
		jp1.add(jp1_4);
		
		jp2_1_1_1.add(new JLabel());
		jp2_1_1_1.add(new JLabel());
		jp2_1_1_1.add(new JLabel("请输入溶液的pH值"));
		jp2_1_1_1.add(jf1_1_1_1);
		jp2_1_1_1.add(new JLabel("请输入弱酸的Ka值"));
		jp2_1_1_1.add(jf1_1_1_2);
		jp2_1_1_1.add(new JLabel());
		jp2_1_1_1.add(new JLabel());
		jp2_1_1_1.add(new JLabel());
		jp2_1_1_1.add(new JLabel());
		jp2_1_1_1.add(new JLabel());
		jp2_1_1_1.add(jb5_1_1_1);
		
		jp2_1_1_2.add(new JLabel());
		jp2_1_1_2.add(new JLabel());
		jp2_1_1_2.add(new JLabel("请输入溶液的pH值"));
		jp2_1_1_2.add(jf1_1_2_1);
		jp2_1_1_2.add(new JLabel("请输入弱碱的Kb值"));
		jp2_1_1_2.add(jf1_1_2_2);
		jp2_1_1_2.add(new JLabel());
		jp2_1_1_2.add(new JLabel());
		jp2_1_1_2.add(new JLabel());
		jp2_1_1_2.add(new JLabel());
		jp2_1_1_2.add(new JLabel());
		jp2_1_1_2.add(jb5_1_1_2);
		
		jp2_1_1_3.add(new JLabel());
		jp2_1_1_3.add(new JLabel());
		jp2_1_1_3.add(new JLabel("请输入溶液的pH值"));
		jp2_1_1_3.add(jf1_1_3_1);
		jp2_1_1_3.add(new JLabel("请输入弱酸的Ka1值"));
		jp2_1_1_3.add(jf1_1_3_2);
		jp2_1_1_3.add(new JLabel("请输入弱酸的Ka2值"));
		jp2_1_1_3.add(jf1_1_3_3);
		jp2_1_1_3.add(new JLabel());
		jp2_1_1_3.add(new JLabel());
		jp2_1_1_3.add(new JLabel());
		jp2_1_1_3.add(jb5_1_1_3);
		
		jp2_1_1_4.add(new JLabel());
		jp2_1_1_4.add(new JLabel());
		jp2_1_1_4.add(new JLabel("请输入溶液的pH值"));
		jp2_1_1_4.add(jf1_1_4_1);
		jp2_1_1_4.add(new JLabel("请输入弱碱的Kb1值"));
		jp2_1_1_4.add(jf1_1_4_2);
		jp2_1_1_4.add(new JLabel("请输入弱碱的Kb2值"));
		jp2_1_1_4.add(jf1_1_4_3);
		jp2_1_1_4.add(new JLabel());
		jp2_1_1_4.add(new JLabel());
		jp2_1_1_4.add(new JLabel());
		jp2_1_1_4.add(jb5_1_1_4);
		
		jp2_1_2_1.add(new JLabel());
		jp2_1_2_1.add(new JLabel());
		jp2_1_2_1.add(new JLabel("请输入弱酸的分析浓度"));
		jp2_1_2_1.add(jf1_2_1_1);
		jp2_1_2_1.add(new JLabel("请输入弱酸的Ka值"));
		jp2_1_2_1.add(jf1_2_1_2);
		jp2_1_2_1.add(new JLabel());
		jp2_1_2_1.add(new JLabel());
		jp2_1_2_1.add(new JLabel());
		jp2_1_2_1.add(new JLabel());
		jp2_1_2_1.add(new JLabel());
		jp2_1_2_1.add(jb5_1_2_1);
		
		jp2_1_2_2.add(new JLabel());
		jp2_1_2_2.add(new JLabel());
		jp2_1_2_2.add(new JLabel("请输入弱碱的分析浓度"));
		jp2_1_2_2.add(jf1_2_2_1);
		jp2_1_2_2.add(new JLabel("请输入弱碱的Kb值"));
		jp2_1_2_2.add(jf1_2_2_2);
		jp2_1_2_2.add(new JLabel());
		jp2_1_2_2.add(new JLabel());
		jp2_1_2_2.add(new JLabel());
		jp2_1_2_2.add(new JLabel());
		jp2_1_2_2.add(new JLabel());
		jp2_1_2_2.add(jb5_1_2_2);
		
		jp2_1_2_3.add(new JLabel());
		jp2_1_2_3.add(new JLabel());
		jp2_1_2_3.add(new JLabel("请输入两性物质的Ka1值"));
		jp2_1_2_3.add(jf1_2_3_1);
		jp2_1_2_3.add(new JLabel("请输入两性物质的Ka2值"));
		jp2_1_2_3.add(jf1_2_3_2);
		jp2_1_2_3.add(new JLabel());
		jp2_1_2_3.add(new JLabel());
		jp2_1_2_3.add(new JLabel());
		jp2_1_2_3.add(new JLabel());
		jp2_1_2_3.add(new JLabel());
		jp2_1_2_3.add(jb5_1_2_3);
		
		jp2_2_1_1.add(new JLabel());
		jp2_2_1_1.add(new JLabel());
		jp2_2_1_1.add(new JLabel("请输入溶液的pH值"));
		jp2_2_1_1.add(jf2_1_1_1);
		jp2_2_1_1.add(new JLabel());
		jp2_2_1_1.add(new JLabel());
		jp2_2_1_1.add(new JLabel());
		jp2_2_1_1.add(new JLabel());
		jp2_2_1_1.add(new JLabel());
		jp2_2_1_1.add(new JLabel());
		jp2_2_1_1.add(new JLabel());
		jp2_2_1_1.add(jb5_2_1_1);
		
		jp2_2_1_2.add(new JLabel());
		jp2_2_1_2.add(new JLabel());
		jp2_2_1_2.add(new JLabel("请输入共存离子的Kf值"));
		jp2_2_1_2.add(jf2_1_2_1);
		jp2_2_1_2.add(new JLabel("请输入共存离子的浓度"));
		jp2_2_1_2.add(jf2_1_2_2);
		jp2_2_1_2.add(new JLabel());
		jp2_2_1_2.add(new JLabel());
		jp2_2_1_2.add(new JLabel());
		jp2_2_1_2.add(new JLabel());
		jp2_2_1_2.add(new JLabel());
		jp2_2_1_2.add(jb5_2_1_2);
		
		jp2_2_2_1.add(new JLabel());
		jp2_2_2_1.add(new JLabel());
		jp2_2_2_1.add(new JLabel("请输入金属离子的Kf值"));
		jp2_2_2_1.add(jf2_2_1_1);
		jp2_2_2_1.add(new JLabel());
		jp2_2_2_1.add(new JLabel());
		jp2_2_2_1.add(new JLabel());
		jp2_2_2_1.add(new JLabel());
		jp2_2_2_1.add(new JLabel());
		jp2_2_2_1.add(new JLabel());
		jp2_2_2_1.add(new JLabel());
		jp2_2_2_1.add(jb5_2_2_1);
		
		jp2_2_2_2.add(new JLabel());
		jp2_2_2_2.add(new JLabel());
		jp2_2_2_2.add(new JLabel("请输入金属离子的价态"));
		jp2_2_2_2.add(jf2_2_2_1);
		jp2_2_2_2.add(new JLabel("请输入金属离子氢氧化物的Ksp值"));
		jp2_2_2_2.add(jf2_2_2_2);
		jp2_2_2_2.add(new JLabel("请输入金属离子的浓度"));
		jp2_2_2_2.add(jf2_2_2_3);
		jp2_2_2_2.add(new JLabel());
		jp2_2_2_2.add(new JLabel());
		jp2_2_2_2.add(new JLabel());
		jp2_2_2_2.add(jb5_2_2_2);
		
		jp2_3_1_1.add(new JLabel());
		jp2_3_1_1.add(new JLabel());
		jp2_3_1_1.add(jf3_1_1_1);
		jp2_3_1_1.add(jf3_1_1_2);
		jp2_3_1_1.add(new JLabel("请输入Ox的化学计量数"));
		jp2_3_1_1.add(jf3_1_1_3);
		jp2_3_1_1.add(jf3_1_1_4);
		jp2_3_1_1.add(new JLabel("请输入Re的化学计量数"));
		jp2_3_1_1.add(jf3_1_1_5);
		jp2_3_1_1.add(jf3_1_1_6);
		jp2_3_1_1.add(new JLabel());
		jp2_3_1_1.add(jb5_3_1_1);
		
		jp2_3_1_2.add(jf3_1_2_1);
		jp2_3_1_2.add(jf3_1_2_2);
		jp2_3_1_2.add(new JLabel("请输入Ox的化学计量数"));
		jp2_3_1_2.add(jf3_1_2_3);
		jp2_3_1_2.add(jf3_1_2_4);
		jp2_3_1_2.add(new JLabel("请输入Re的化学计量数"));
		jp2_3_1_2.add(jf3_1_2_5);
		jp2_3_1_2.add(jf3_1_2_6);
		jp2_3_1_2.add(new JLabel("请输入H+的化学计量数"));
		jp2_3_1_2.add(jf3_1_2_7);
		jp2_3_1_2.add(jf3_1_2_8);
		jp2_3_1_2.add(jb5_3_1_2);
		
		jp2_3_1_3.add(jf3_1_3_1);
		jp2_3_1_3.add(jf3_1_3_2);
		jp2_3_1_3.add(new JLabel("请输入Ox的化学计量数"));
		jp2_3_1_3.add(jf3_1_3_3);
		jp2_3_1_3.add(jf3_1_3_4);
		jp2_3_1_3.add(new JLabel("请输入Re的化学计量数"));
		jp2_3_1_3.add(jf3_1_3_5);
		jp2_3_1_3.add(jf3_1_3_6);
		jp2_3_1_3.add(new JLabel("请输入OH-的化学计量数"));
		jp2_3_1_3.add(jf3_1_3_7);
		jp2_3_1_3.add(jf3_1_3_8);
		jp2_3_1_3.add(jb5_3_1_3);
		
		jp2.add(new JPanel(), "");
		jp2.add(jp2_1_1_1, str3_1_1[1]);
		jp2.add(jp2_1_1_2, str3_1_1[2]);
		jp2.add(jp2_1_1_3, str3_1_1[3]);
		jp2.add(jp2_1_1_4, str3_1_1[4]);
		jp2.add(jp2_1_2_1, str3_1_2[1]);
		jp2.add(jp2_1_2_2, str3_1_2[2]);
		jp2.add(jp2_1_2_3, str3_1_2[3]);
		jp2.add(jp2_2_1_1, str3_2_1[1]);
		jp2.add(jp2_2_1_2, str3_2_1[2]);
		jp2.add(jp2_2_2_1, str3_2_2[1]);
		jp2.add(jp2_2_2_2, str3_2_2[2]);
		jp2.add(jp2_3_1_1, str3_3_1[1]);
		jp2.add(jp2_3_1_2, str3_3_1[2]);
		jp2.add(jp2_3_1_3, str3_3_1[3]);
		
		jp3_1_err.add(new JPanel());
		jp3_1_err.add(new JPanel());
		jp3_1_err.add(new JLabel("输入的数据有误"));
		jp3_1_err.add(new JLabel("无法计算"));
		jp3_1_err.add(new JLabel("请检查输入的数据"));
		jp3_1_err.add(new JLabel("更改后再次点击\"好的\"按钮"));
		
		jp3_1_1_1_1.add(new JPanel());
		jp3_1_1_1_1.add(new JPanel());
		jp3_1_1_1_1.add(new Label("sigma(HA)="));
		jp3_1_1_1_1.add(jop1_1_1_1);
		jp3_1_1_1_1.add(new Label("sigma(A-)="));
		jp3_1_1_1_1.add(jop1_1_1_2);
		
		jp3_1_1_1_2.add(new JPanel());
		jp3_1_1_1_2.add(new JPanel());
		jp3_1_1_1_2.add(new Label("sigma(BOH)="));
		jp3_1_1_1_2.add(jop1_1_2_1);
		jp3_1_1_1_2.add(new Label("sigma(B+)="));
		jp3_1_1_1_2.add(jop1_1_2_2);
		
		jp3_1_1_1_3.add(new JPanel());
		jp3_1_1_1_3.add(new JPanel());
		jp3_1_1_1_3.add(new Label("sigma(H2A)="));
		jp3_1_1_1_3.add(jop1_1_3_1);
		jp3_1_1_1_3.add(new Label("sigma(HA-)="));
		jp3_1_1_1_3.add(jop1_1_3_2);
		jp3_1_1_1_3.add(new Label("sigma(A2-)="));
		jp3_1_1_1_3.add(jop1_1_3_3);
		
		jp3_1_1_1_4.add(new JPanel());
		jp3_1_1_1_4.add(new JPanel());
		jp3_1_1_1_4.add(new Label("sigma(B(OH)2)="));
		jp3_1_1_1_4.add(jop1_1_4_1);
		jp3_1_1_1_4.add(new Label("sigma(B(OH)+)="));
		jp3_1_1_1_4.add(jop1_1_4_2);
		jp3_1_1_1_4.add(new Label("sigma(B2+)="));
		jp3_1_1_1_4.add(jop1_1_4_3);
		
		jp3_1_1_2_1.add(new JPanel());
		jp3_1_1_2_1.add(new JPanel());
		jp3_1_1_2_1.add(new Label("c(H+)="));
		jp3_1_1_2_1.add(jop1_2_1_1);
		jp3_1_1_2_1.add(new Label("pH="));
		jp3_1_1_2_1.add(jop1_2_1_2);
		
		jp3_1_1_2_2.add(new JPanel());
		jp3_1_1_2_2.add(new JPanel());
		jp3_1_1_2_2.add(new Label("c(OH-)="));
		jp3_1_1_2_2.add(jop1_2_2_1);
		jp3_1_1_2_2.add(new Label("pH="));
		jp3_1_1_2_2.add(jop1_2_2_2);
		
		jp3_1_1_2_3.add(new JPanel());
		jp3_1_1_2_3.add(new JPanel());
		jp3_1_1_2_3.add(new Label("c(H+)="));
		jp3_1_1_2_3.add(jop1_2_3_1);
		jp3_1_1_2_3.add(new Label("pH="));
		jp3_1_1_2_3.add(jop1_2_3_2);
		
		jp3_1_2_1_1.add(new JPanel());
		jp3_1_2_1_1.add(new JPanel());
		jp3_1_2_1_1.add(new Label("alphaY(H)="));
		jp3_1_2_1_1.add(jop2_1_1_1);
		jp3_1_2_1_1.add(new Label("lg alphaY(H)="));
		jp3_1_2_1_1.add(jop2_1_1_2);
		
		jp3_1_2_1_2.add(new JPanel());
		jp3_1_2_1_2.add(new JPanel());
		jp3_1_2_1_2.add(new Label("alphaY(N)="));
		jp3_1_2_1_2.add(jop2_1_2_1);
		jp3_1_2_1_2.add(new Label("lg alphaY(N)="));
		jp3_1_2_1_2.add(jop2_1_2_2);
		
		jp3_1_2_2_1.add(new JPanel());
		jp3_1_2_2_1.add(new JPanel());
		jp3_1_2_2_1.add(new Label("pH min="));
		jp3_1_2_2_1.add(jop2_2_1_1);
		
		jp3_1_2_2_2.add(new JPanel());
		jp3_1_2_2_2.add(new JPanel());
		jp3_1_2_2_2.add(new Label("pH max="));
		jp3_1_2_2_2.add(jop2_2_2_1);
		
		jp3_1_3_1_1.add(new JPanel());
		jp3_1_3_1_1.add(new JPanel());
		jp3_1_3_1_1.add(new Label("phi'="));
		jp3_1_3_1_1.add(jop3_1_1_1);
		
		jp3_1_3_1_2.add(new JPanel());
		jp3_1_3_1_2.add(new JPanel());
		jp3_1_3_1_2.add(new Label("phi'="));
		jp3_1_3_1_2.add(jop3_1_2_1);
		
		jp3_1_3_1_3.add(new JPanel());
		jp3_1_3_1_3.add(new JPanel());
		jp3_1_3_1_3.add(new Label("phi'="));
		jp3_1_3_1_3.add(jop3_1_3_1);
		
		jp3_1.add(new JPanel(), "");
		jp3_1.add(jp3_1_err, "err");
		jp3_1.add(jp3_1_1_1_1, "1_1_1");
		jp3_1.add(jp3_1_1_1_2, "1_1_2");
		jp3_1.add(jp3_1_1_1_3, "1_1_3");
		jp3_1.add(jp3_1_1_1_4, "1_1_4");
		jp3_1.add(jp3_1_1_2_1, "1_2_1");
		jp3_1.add(jp3_1_1_2_2, "1_2_2");
		jp3_1.add(jp3_1_1_2_3, "1_2_3");
		jp3_1.add(jp3_1_2_1_1, "2_1_1");
		jp3_1.add(jp3_1_2_1_2, "2_1_2");
		jp3_1.add(jp3_1_2_2_1, "2_2_1");
		jp3_1.add(jp3_1_2_2_2, "2_2_2");
		jp3_1.add(jp3_1_3_1_1, "3_1_1");
		jp3_1.add(jp3_1_3_1_2, "3_1_2");
		jp3_1.add(jp3_1_3_1_3, "3_1_3");
		
		JPanel thx = new JPanel();
		thx.setLayout(new GridLayout(8,1));
		thx.add(new JLabel("感谢使用ACCC"));
		thx.add(new JLabel("很惭愧，就做了一点微小的工作，谢谢大家"));
		thx.add(new JLabel("点击\"好的\"按钮重新计算"));
		thx.add(jb6_1);
		thx.add(new JLabel("点击\"+1s\"按钮续命"));
		thx.add(jb6_2);
		thx.add(new JLabel("点击\"退出\"按钮退出程序"));
		thx.add(jb6_3);
		
		jp3_2.add(new JPanel(), "");
		jp3_2.add(thx, "thx");
		
		jp3.add(jp3_1);
		jp3.add(jp3_2);
		
		JFrame jf = new JFrame("ACCC");
		jf.setVisible(true);
		jf.setSize(800, 550);
		jf.setLocation(256, 64);
		jf.setResizable(false);
		
		Container co = jf.getContentPane();
		co.setLayout(new GridLayout(0,3,1,0));
		co.setBackground(Color.LIGHT_GRAY);
		co.add(jp1);
		co.add(jp2);
		co.add(jp3);
		
		JFrame ha = new JFrame("Excited!");
		ha.setSize(920,600);
		ha.setResizable(false);
		ha.setVisible(false);
		Container haha = ha.getContentPane();
		haha.setLayout(new GridLayout(54,0));
		haha.add(new JLabel("______________________________##________________________________________________________________________________________________"));
		haha.add(new JLabel("_____________________________####_______________________________________________________________________________________________"));
		haha.add(new JLabel("_____________________________####_______________________________________________________________________________________________"));
		haha.add(new JLabel("____________________________######_________________________________________________________________#____________________________"));
		haha.add(new JLabel("____________________________######_#____________________________________________________________________________________________"));
		haha.add(new JLabel("___________________________######___________________________________________________________________#___________________________"));
		haha.add(new JLabel("___________________________#######__________________________________________________________________#___________________________"));
		haha.add(new JLabel("___________________________######__#______________________________________________________________#_#___________________________"));
		haha.add(new JLabel("___________________________########_______________________________________________________________###___________________________"));
		haha.add(new JLabel("___________________________#######_________________________________________________________________##___________________________"));
		haha.add(new JLabel("___________________________######_#________________________________________________________________##___________________________"));
		haha.add(new JLabel("__________________________########_______________________________________________________________####___________________________"));
		haha.add(new JLabel("__________________________#######__________________________________________________________________##___________________________"));
		haha.add(new JLabel("__________________________######_#________________________________________________________________##____________________________"));
		haha.add(new JLabel("__________________________#######__________________________________________________________________#____________________________"));
		haha.add(new JLabel("__________________________########_______________________________________________________________###____________________________"));
		haha.add(new JLabel("___________________________#######_#_____________________________________________________________###____________________________"));
		haha.add(new JLabel("____________________________#####_#_#____________________________________________________________###____________________________"));
		haha.add(new JLabel("___________________________########______________________________________________________________###____________________________"));
		haha.add(new JLabel("___________________________########__#_______###_________#_______________________________________#_#____________________________"));
		haha.add(new JLabel("____________________________######_#_______##________________##___________#__________#_#________##______________________________"));
		haha.add(new JLabel("____________________________########______##__________________________###_______________#________#______________________________"));
		haha.add(new JLabel("_______________________________#_##_####_##__________________________##____________________#____________________________________"));
		haha.add(new JLabel("________________________________#____##__#______________________######_____________________#____________________________________"));
		haha.add(new JLabel("______________________________________#__##__________##_#_______######_______##____________##___________________________________"));
		haha.add(new JLabel("_________________________________________#______________________######_______###__#________##___________________________________"));
		haha.add(new JLabel("_________________________________________#______________________##_###________#____#________#___________________________________"));
		haha.add(new JLabel("_________________________________________#______________________###_##______________________#___________________________________"));
		haha.add(new JLabel("_________________________________________#______________________#____#______________________#___________________________________"));
		haha.add(new JLabel("_________________________________________#_____________________##____#______________________#___________________________________"));
		haha.add(new JLabel("_________________________________________#_____________________#_____##_________________________________________________________"));
		haha.add(new JLabel("_______________________________________________________________#______#_________________________________________________________"));
		haha.add(new JLabel("______________________________________________________________#_______#____________________#____________________________________"));
		haha.add(new JLabel("__________________________________________#__________________##________#___________________#____________________________________"));
		haha.add(new JLabel("__________________________________________#__________________#_________#________________________________________________________"));
		haha.add(new JLabel("____________________________________________________________#___________#_______________________________________________________"));
		haha.add(new JLabel("____________________________________________##____________##_____________#______________________________________________________"));
		haha.add(new JLabel("_________________________________________________######_________________________________________________________________________"));
		haha.add(new JLabel("_____________________________________________________________________________#______##__________________________________________"));
		haha.add(new JLabel("________________________________________________________________________________________________________________________________"));
		haha.add(new JLabel("_____________________________________________________________##_________________________________________________________________"));
		haha.add(new JLabel("_____________________________________________________________##______###________________________________________________________"));
		haha.add(new JLabel("________________________________________________________________________________________________________________________________"));
		haha.add(new JLabel("________________________________________________________________________________________________________________________________"));
		haha.add(new JLabel("________________________________________________________________________________________________________________________________"));
		haha.add(new JLabel("________________________________________________________________________________________________________________________________"));
		haha.add(new JLabel("________________________________________________________________________________________________________________________________"));
		haha.add(new JLabel("________________________________________________________________________________________________________________________________"));
		haha.add(new JLabel("________________________________________________________________________________________________________________________________"));
		
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cl1_2.show(jp1_2, "1");
			}
		});
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cl1_3.show(jp1_3, cb1.getSelectedItem().toString());
			}
		});
		b3_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cl1_4.show(jp1_4, cb2_1.getSelectedItem().toString());
			}
		});
		b3_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cl1_4.show(jp1_4, cb2_2.getSelectedItem().toString());
			}
		});
		b3_3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cl1_4.show(jp1_4, cb2_3.getSelectedItem().toString());
			}
		});
		b4_1_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cl2.show(jp2, cb3_1_1.getSelectedItem().toString());
			}
		});
		b4_1_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cl2.show(jp2, cb3_1_2.getSelectedItem().toString());
			}
		});
		b4_2_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cl2.show(jp2, cb3_2_1.getSelectedItem().toString());
			}
		});
		b4_2_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cl2.show(jp2, cb3_2_2.getSelectedItem().toString());
			}
		});
		b4_3_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cl2.show(jp2, cb3_3_1.getSelectedItem().toString());
			}
		});
		b5_1_1_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				t1 = f1_1_1_1_1.getText().toString();
				t2 = f1_1_1_2_1.getText().toString();
				t3 = f1_1_1_2_2.getText().toString();
				bo = true ;
				accc.check(t1);
				accc.check(t2);
				accc.check(t3);
				if(bo){
					Scanner sc1 = new Scanner(t1);
					Scanner sc2 = new Scanner(t2);
					Scanner sc3 = new Scanner(t3);
					
					double d1 = sc1.nextDouble();
					double d2 = sc2.nextDouble();
					double d3 = sc3.nextDouble();
					double CH = Math.pow(10, -d1);
					double Ka = d2*Math.pow(10, d3);
					double sigmaHA = CH/(CH+Ka);
					double sigmaA = Ka/(CH+Ka);
					
					op1_1_1_1_1.setText(df.format(sigmaHA));
					op1_1_1_2_1.setText(df.format(sigmaA));
					
					cl3_1.show(jp3_1, "1_1_1");
					cl3_2.show(jp3_2, "thx");
					
					sc1.close();
					sc2.close();
					sc3.close();
				}else{
					cl3_1.show(jp3_1, "err");
				}
			}
		});
		b5_1_1_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				t1 = f1_1_2_1_1.getText().toString();
				t2 = f1_1_2_2_1.getText().toString();
				t3 = f1_1_2_2_2.getText().toString();
				bo = true ;
				accc.check(t1);
				accc.check(t2);
				accc.check(t3);
				if(bo){
					Scanner sc1 = new Scanner(t1);
					Scanner sc2 = new Scanner(t2);
					Scanner sc3 = new Scanner(t3);
					
					double d1 = sc1.nextDouble();
					double d2 = sc2.nextDouble();
					double d3 = sc3.nextDouble();
					double COH = Math.pow(10, -14+d1);
					double Kb = d2*Math.pow(10, d3);
					double sigmaBOH = COH/(COH+Kb);
					double sigmaB = Kb/(COH+Kb);
					
					op1_1_2_1_1.setText(df.format(sigmaBOH));
					op1_1_2_2_1.setText(df.format(sigmaB));
					
					cl3_1.show(jp3_1, "1_1_2");
					cl3_2.show(jp3_2, "thx");
					
					sc1.close();
					sc2.close();
					sc3.close();
				}else{
					cl3_1.show(jp3_1, "err");
				}
			}
		});
		b5_1_1_3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				t1 = f1_1_3_1_1.getText().toString();
				t2 = f1_1_3_2_1.getText().toString();
				t3 = f1_1_3_2_2.getText().toString();
				t4 = f1_1_3_3_1.getText().toString();
				t5 = f1_1_3_3_2.getText().toString();
				bo = true ;
				accc.check(t1);
				accc.check(t2);
				accc.check(t3);
				accc.check(t4);
				accc.check(t5);
				if(bo){
					Scanner sc1 = new Scanner(t1);
					Scanner sc2 = new Scanner(t2);
					Scanner sc3 = new Scanner(t3);
					Scanner sc4 = new Scanner(t4);
					Scanner sc5 = new Scanner(t5);
					
					double d1 = sc1.nextDouble();
					double d2 = sc2.nextDouble();
					double d3 = sc3.nextDouble();
					double d4 = sc4.nextDouble();
					double d5 = sc5.nextDouble();
					double CH = Math.pow(10, -d1);
					double Ka1 = d2*Math.pow(10, d3);
					double Ka2 = d4*Math.pow(10, d5);
					double sigmaH2A = Math.pow(CH, 2)/(Math.pow(CH, 2)+CH*Ka1+Ka1*Ka2);
					double sigmaHA = CH*Ka1/(Math.pow(CH, 2)+CH*Ka1+Ka1*Ka2);
					double sigmaA = Ka1*Ka2/(Math.pow(CH, 2)+CH*Ka1+Ka1*Ka2);
					
					op1_1_3_1_1.setText(df.format(sigmaH2A));
					op1_1_3_2_1.setText(df.format(sigmaHA));
					op1_1_3_3_1.setText(df.format(sigmaA));
					
					cl3_1.show(jp3_1, "1_1_3");
					cl3_2.show(jp3_2, "thx");
					
					sc1.close();
					sc2.close();
					sc3.close();
					sc4.close();
					sc5.close();
				}else{
					cl3_1.show(jp3_1, "err");
				}
			}
		});
		b5_1_1_4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				t1 = f1_1_4_1_1.getText().toString();
				t2 = f1_1_4_2_1.getText().toString();
				t3 = f1_1_4_2_2.getText().toString();
				t4 = f1_1_4_3_1.getText().toString();
				t5 = f1_1_4_3_2.getText().toString();
				bo = true ;
				accc.check(t1);
				accc.check(t2);
				accc.check(t3);
				accc.check(t4);
				accc.check(t5);
				if(bo){
					Scanner sc1 = new Scanner(t1);
					Scanner sc2 = new Scanner(t2);
					Scanner sc3 = new Scanner(t3);
					Scanner sc4 = new Scanner(t4);
					Scanner sc5 = new Scanner(t5);
					
					double d1 = sc1.nextDouble();
					double d2 = sc2.nextDouble();
					double d3 = sc3.nextDouble();
					double d4 = sc4.nextDouble();
					double d5 = sc5.nextDouble();
					double COH = Math.pow(10, -14+d1);
					double Kb1 = d2*Math.pow(10, d3);
					double Kb2 = d4*Math.pow(10, d5);
					double sigmaBOH2 = Math.pow(COH, 2)/(Math.pow(COH, 2)+COH*Kb1+Kb1*Kb2);
					double sigmaBOH = COH*Kb1/(Math.pow(COH, 2)+COH*Kb1+Kb1*Kb2);
					double sigmaB = Kb1*Kb2/(Math.pow(COH, 2)+COH*Kb1+Kb1*Kb2);
					
					op1_1_4_1_1.setText(df.format(sigmaBOH2));
					op1_1_4_2_1.setText(df.format(sigmaBOH));
					op1_1_4_3_1.setText(df.format(sigmaB));
					
					cl3_1.show(jp3_1, "1_1_4");
					cl3_2.show(jp3_2, "thx");
					
					sc1.close();
					sc2.close();
					sc3.close();
					sc4.close();
					sc5.close();
				}else{
					cl3_1.show(jp3_1, "err");
				}
			}
		});
		b5_1_2_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				t1 = f1_2_1_1_1.getText().toString();
				t2 = f1_2_1_1_2.getText().toString();
				t3 = f1_2_1_2_1.getText().toString();
				t4 = f1_2_1_2_2.getText().toString();
				bo = true ;
				accc.check(t1);
				accc.check(t2);
				accc.check(t3);
				accc.check(t4);
				if(bo){
					Scanner sc1 = new Scanner(t1);
					Scanner sc2 = new Scanner(t2);
					Scanner sc3 = new Scanner(t3);
					Scanner sc4 = new Scanner(t4);
					
					double d1 = sc1.nextDouble();
					double d2 = sc2.nextDouble();
					double d3 = sc3.nextDouble();
					double d4 = sc4.nextDouble();
					double C0 = d1*Math.pow(10, d2);
					double Ka = d3*Math.pow(10, d4);
					double Kw = Math.pow(10, -14);
					double CH;
					if(Ka*C0>=20*Kw){
						CH = (-Ka + Math.sqrt(Math.pow(Ka,2)+4*C0*Ka))/2;
					}else{
						CH = Math.sqrt(Ka*C0+Kw);
					}
					double pH = -Math.log10(CH);
					
					op1_2_1_1_1.setText(strE(CH)+"mol/L");
					op1_2_1_2_1.setText(df.format(pH));
					
					cl3_1.show(jp3_1, "1_2_1");
					cl3_2.show(jp3_2, "thx");
					
					sc1.close();
					sc2.close();
					sc3.close();
					sc4.close();
				}else{
					cl3_1.show(jp3_1, "err");
				}
			}
		});
		b5_1_2_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				t1 = f1_2_2_1_1.getText().toString();
				t2 = f1_2_2_1_2.getText().toString();
				t3 = f1_2_2_2_1.getText().toString();
				t4 = f1_2_2_2_2.getText().toString();
				bo = true ;
				accc.check(t1);
				accc.check(t2);
				accc.check(t3);
				accc.check(t4);
				if(bo){
					Scanner sc1 = new Scanner(t1);
					Scanner sc2 = new Scanner(t2);
					Scanner sc3 = new Scanner(t3);
					Scanner sc4 = new Scanner(t4);
					
					double d1 = sc1.nextDouble();
					double d2 = sc2.nextDouble();
					double d3 = sc3.nextDouble();
					double d4 = sc4.nextDouble();
					double C0 = d1*Math.pow(10, d2);
					double Kb = d3*Math.pow(10, d4);
					double Kw = Math.pow(10, -14);
					double COH;
					if(Kb*C0>=20*Kw){
						COH = (-Kb + Math.sqrt(Math.pow(Kb,2)+4*C0*Kb))/2;
					}else{
						COH = Math.sqrt(Kb*C0+Kw);
					}
					double pH = Math.log10(COH) + 14;
					
					op1_2_2_1_1.setText(strE(COH)+"mol/L");
					op1_2_2_2_1.setText(df.format(pH));
					
					cl3_1.show(jp3_1, "1_2_2");
					cl3_2.show(jp3_2, "thx");
					
					sc1.close();
					sc2.close();
					sc3.close();
					sc4.close();
				}else{
					cl3_1.show(jp3_1, "err");
				}
			}
		});
		b5_1_2_3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				t1 = f1_2_3_1_1.getText().toString();
				t2 = f1_2_3_1_2.getText().toString();
				t3 = f1_2_3_2_1.getText().toString();
				t4 = f1_2_3_2_2.getText().toString();
				bo = true ;
				accc.check(t1);
				accc.check(t2);
				accc.check(t3);
				accc.check(t4);
				if(bo){
					Scanner sc1 = new Scanner(t1);
					Scanner sc2 = new Scanner(t2);
					Scanner sc3 = new Scanner(t3);
					Scanner sc4 = new Scanner(t4);
					
					double d1 = sc1.nextDouble();
					double d2 = sc2.nextDouble();
					double d3 = sc3.nextDouble();
					double d4 = sc4.nextDouble();
					double Ka1 = d1*Math.pow(10, d2);
					double Ka2 = d3*Math.pow(10, d4);
					double CH = Math.sqrt(Ka1*Ka2);
					double pH = -Math.log10(CH);
					
					op1_2_3_1_1.setText(strE(CH)+"mol/L");
					op1_2_3_2_1.setText(df.format(pH));
					
					cl3_1.show(jp3_1, "1_2_3");
					cl3_2.show(jp3_2, "thx");
					
					sc1.close();
					sc2.close();
					sc3.close();
					sc4.close();
				}else{
					cl3_1.show(jp3_1, "err");
				}
			}
		});
		b5_2_1_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				t1 = f2_1_1_1_1.getText().toString();
				bo = true ;
				accc.check(t1);
				if(bo){
					Scanner sc1 = new Scanner(t1);
					
					double d1 = sc1.nextDouble();
					double CH = Math.pow(10, -d1);
					double beta1 = Math.pow(10, 10.34);
					double beta2 = Math.pow(10, 16.58);
					double beta3 = Math.pow(10, 19.33);
					double beta4 = Math.pow(10, 21.40);
					double beta5 = Math.pow(10, 23.0);
					double beta6 = Math.pow(10, 23.9);
					double alphaYH = 1 + Math.pow(CH, 1)*beta1 + Math.pow(CH, 2)*beta2 + Math.pow(CH, 3)*beta3 + Math.pow(CH, 4)*beta4 + Math.pow(CH, 5)*beta5 + Math.pow(CH, 6)*beta6 ;
					double lgalphaYH = Math.log10(alphaYH);
					
					op2_1_1_1_1.setText(strE(alphaYH));
					op2_1_1_2_1.setText(df.format(lgalphaYH));
					
					cl3_1.show(jp3_1, "2_1_1");
					cl3_2.show(jp3_2, "thx");
					
					sc1.close();
				}else{
					cl3_1.show(jp3_1, "err");
				}
			}
		});
		b5_2_1_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				t1 = f2_1_2_1_1.getText().toString();
				t2 = f2_1_2_1_2.getText().toString();
				t3 = f2_1_2_2_1.getText().toString();
				t4 = f2_1_2_2_2.getText().toString();
				bo = true ;
				accc.check(t1);
				accc.check(t2);
				accc.check(t3);
				accc.check(t4);
				if(bo){
					Scanner sc1 = new Scanner(t1);
					Scanner sc2 = new Scanner(t2);
					Scanner sc3 = new Scanner(t3);
					Scanner sc4 = new Scanner(t4);
					
					double d1 = sc1.nextDouble();
					double d2 = sc2.nextDouble();
					double d3 = sc3.nextDouble();
					double d4 = sc4.nextDouble();
					double Kf = d1*Math.pow(10, d2);
					double CN = d3*Math.pow(10, d4);
					double alphaYN = 1 + Kf*CN ;
					double lgalphaYN = Math.log10(alphaYN);
					
					op2_1_2_1_1.setText(strE(alphaYN));
					op2_1_2_2_1.setText(df.format(lgalphaYN));
					
					cl3_1.show(jp3_1, "2_1_2");
					cl3_2.show(jp3_2, "thx");
					
					sc1.close();
					sc2.close();
					sc3.close();
					sc4.close();
				}else{
					cl3_1.show(jp3_1, "err");
				}
			}
		});
		b5_2_2_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				t1 = f2_2_1_1_1.getText().toString();
				t2 = f2_2_1_1_2.getText().toString();
				bo = true ;
				accc.check(t1);
				accc.check(t2);
				if(bo){
					
				}
				if(bo){
					Scanner sc1 = new Scanner(t1);
					Scanner sc2 = new Scanner(t2);
					
					double d1 = sc1.nextDouble();
					double d2 = sc2.nextDouble();
					double Kf = d1*Math.pow(10, d2);
					double beta1 = Math.pow(10, 10.34);
					double beta2 = Math.pow(10, 16.58);
					double beta3 = Math.pow(10, 19.33);
					double beta4 = Math.pow(10, 21.40);
					double beta5 = Math.pow(10, 23.0);
					double beta6 = Math.pow(10, 23.9);
					double pH = 0 ;
					double CH = Math.pow(10, -pH);
					double alphaYH = 1 + Math.pow(CH, 1)*beta1 + Math.pow(CH, 2)*beta2 + Math.pow(CH, 3)*beta3 + Math.pow(CH, 4)*beta4 + Math.pow(CH, 5)*beta5 + Math.pow(CH, 6)*beta6 ;
					double lgalphaYH = Math.log10(alphaYH);
					if(Math.log10(Kf)-8>0){
						while(lgalphaYH > Math.log10(Kf)-8){
							pH += 0.5 ;
							CH = Math.pow(10, -pH);
							alphaYH = 1 + Math.pow(CH, 1)*beta1 + Math.pow(CH, 2)*beta2 + Math.pow(CH, 3)*beta3 + Math.pow(CH, 4)*beta4 + Math.pow(CH, 5)*beta5 + Math.pow(CH, 6)*beta6 ;
							lgalphaYH = Math.log10(alphaYH);
						}
						op2_2_1_1_1.setText(df.format(pH));
					
						cl3_1.show(jp3_1, "2_2_1");
						cl3_2.show(jp3_2, "thx");
					}else{
						cl3_1.show(jp3_1, "err");						
					}
					
					sc1.close();
					sc2.close();
				}else{
					cl3_1.show(jp3_1, "err");
				}
			}
		});
		b5_2_2_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				t1 = f2_2_2_1_1.getText().toString();
				t2 = f2_2_2_2_1.getText().toString();
				t3 = f2_2_2_2_2.getText().toString();
				t4 = f2_2_2_3_1.getText().toString();
				t5 = f2_2_2_3_2.getText().toString();
				bo = true ;
				accc.check(t1);
				accc.check(t2);
				accc.check(t3);
				accc.check(t4);
				accc.check(t5);
				if(bo){
					Scanner sc1 = new Scanner(t1);
					Scanner sc2 = new Scanner(t2);
					Scanner sc3 = new Scanner(t3);
					Scanner sc4 = new Scanner(t4);
					Scanner sc5 = new Scanner(t5);
					
					double d1 = sc1.nextDouble();
					double d2 = sc2.nextDouble();
					double d3 = sc3.nextDouble();
					double d4 = sc4.nextDouble();
					double d5 = sc5.nextDouble();
					double Ksp = d2*Math.pow(10, d3);
					double CM = d4*Math.pow(10, d5);
					double COH = Math.pow(Ksp/CM, 1/d1);
					double pH = 14 + Math.log10(COH);
					
					op2_2_2_1_1.setText(df.format(pH));
					
					cl3_1.show(jp3_1, "2_2_2");
					cl3_2.show(jp3_2, "thx");
					
					sc1.close();
					sc2.close();
					sc3.close();
					sc4.close();
					sc5.close();
				}else{
					cl3_1.show(jp3_1, "err");
				}
			}
		});
		b5_3_1_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				t1 = f3_1_1_1_1.getText().toString();
				t2 = f3_1_1_2_1.getText().toString();
				t3 = f3_1_1_3_1.getText().toString();
				t4 = f3_1_1_4_1.getText().toString();
				t5 = f3_1_1_4_2.getText().toString();
				t6 = f3_1_1_5_1.getText().toString();
				t7 = f3_1_1_6_1.getText().toString();
				t8 = f3_1_1_6_2.getText().toString();
				bo = true ;
				accc.check(t1);
				accc.check(t2);
				accc.check(t3);
				accc.check(t4);
				accc.check(t5);
				accc.check(t6);
				accc.check(t7);
				accc.check(t8);
				if(bo){
					Scanner sc1 = new Scanner(t1);
					Scanner sc2 = new Scanner(t2);
					Scanner sc3 = new Scanner(t3);
					Scanner sc4 = new Scanner(t4);
					Scanner sc5 = new Scanner(t5);
					Scanner sc6 = new Scanner(t6);
					Scanner sc7 = new Scanner(t7);
					Scanner sc8 = new Scanner(t8);
					
					double d1 = sc1.nextDouble();
					double d2 = sc2.nextDouble();
					double d3 = sc3.nextDouble();
					double d4 = sc4.nextDouble();
					double d5 = sc5.nextDouble();
					double d6 = sc6.nextDouble();
					double d7 = sc7.nextDouble();
					double d8 = sc8.nextDouble();
					double phi = d1;
					double ne = d2;
					double nOx = d3;
					double COx = d4*Math.pow(10, d5);
					double nRe = d6;
					double CRe = d7*Math.pow(10, d8);
					double phi_ = phi+0.0592/ne*Math.log10(Math.pow(COx, nOx)/Math.pow(CRe, nRe));
					
					op3_1_1_1_1.setText(df.format(phi_));
					
					cl3_1.show(jp3_1, "3_1_1");
					cl3_2.show(jp3_2, "thx");
					
					sc1.close();
					sc2.close();
					sc3.close();
					sc4.close();
					sc5.close();
					sc6.close();
					sc7.close();
					sc8.close();
				}else{
					cl3_1.show(jp3_1, "err");
				}
			}
		});
		b5_3_1_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				t1 = f3_1_2_1_1.getText().toString();
				t2 = f3_1_2_2_1.getText().toString();
				t3 = f3_1_2_3_1.getText().toString();
				t4 = f3_1_2_4_1.getText().toString();
				t5 = f3_1_2_4_2.getText().toString();
				t6 = f3_1_2_5_1.getText().toString();
				t7 = f3_1_2_6_1.getText().toString();
				t8 = f3_1_2_6_2.getText().toString();
				t9 = f3_1_2_7_1.getText().toString();
				tX = f3_1_2_8_1.getText().toString();
				bo = true ;
				accc.check(t1);
				accc.check(t2);
				accc.check(t3);
				accc.check(t4);
				accc.check(t5);
				accc.check(t6);
				accc.check(t7);
				accc.check(t8);
				accc.check(t9);
				accc.check(tX);
				if(bo){
					Scanner sc1 = new Scanner(t1);
					Scanner sc2 = new Scanner(t2);
					Scanner sc3 = new Scanner(t3);
					Scanner sc4 = new Scanner(t4);
					Scanner sc5 = new Scanner(t5);
					Scanner sc6 = new Scanner(t6);
					Scanner sc7 = new Scanner(t7);
					Scanner sc8 = new Scanner(t8);
					Scanner sc9 = new Scanner(t9);
					Scanner scX = new Scanner(tX);
					
					double d1 = sc1.nextDouble();
					double d2 = sc2.nextDouble();
					double d3 = sc3.nextDouble();
					double d4 = sc4.nextDouble();
					double d5 = sc5.nextDouble();
					double d6 = sc6.nextDouble();
					double d7 = sc7.nextDouble();
					double d8 = sc8.nextDouble();
					double d9 = sc9.nextDouble();
					double dX = scX.nextDouble();
					double phi = d1;
					double ne = d2;
					double nOx = d3;
					double COx = d4*Math.pow(10, d5);
					double nRe = d6;
					double CRe = d7*Math.pow(10, d8);
					double nH = d9;
					double CH = Math.pow(10, -dX);
					double phi_ = phi+0.0592/ne*Math.log10(Math.pow(COx, nOx)*Math.pow(CH, nH)/Math.pow(CRe, nRe));
					
					op3_1_2_1_1.setText(df.format(phi_));
					
					cl3_1.show(jp3_1, "3_1_2");
					cl3_2.show(jp3_2, "thx");
					
					sc1.close();
					sc2.close();
					sc3.close();
					sc4.close();
					sc5.close();
					sc6.close();
					sc7.close();
					sc8.close();
					sc9.close();
					scX.close();
				}else{
					cl3_1.show(jp3_1, "err");
				}
			}
		});
		b5_3_1_3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				t1 = f3_1_3_1_1.getText().toString();
				t2 = f3_1_3_2_1.getText().toString();
				t3 = f3_1_3_3_1.getText().toString();
				t4 = f3_1_3_4_1.getText().toString();
				t5 = f3_1_3_4_2.getText().toString();
				t6 = f3_1_3_5_1.getText().toString();
				t7 = f3_1_3_6_1.getText().toString();
				t8 = f3_1_3_6_2.getText().toString();
				t9 = f3_1_3_7_1.getText().toString();
				tX = f3_1_3_8_1.getText().toString();
				bo = true ;
				accc.check(t1);
				accc.check(t2);
				accc.check(t3);
				accc.check(t4);
				accc.check(t5);
				accc.check(t6);
				accc.check(t7);
				accc.check(t8);
				accc.check(t9);
				accc.check(tX);
				if(bo){
					Scanner sc1 = new Scanner(t1);
					Scanner sc2 = new Scanner(t2);
					Scanner sc3 = new Scanner(t3);
					Scanner sc4 = new Scanner(t4);
					Scanner sc5 = new Scanner(t5);
					Scanner sc6 = new Scanner(t6);
					Scanner sc7 = new Scanner(t7);
					Scanner sc8 = new Scanner(t8);
					Scanner sc9 = new Scanner(t9);
					Scanner scX = new Scanner(tX);
					
					double d1 = sc1.nextDouble();
					double d2 = sc2.nextDouble();
					double d3 = sc3.nextDouble();
					double d4 = sc4.nextDouble();
					double d5 = sc5.nextDouble();
					double d6 = sc6.nextDouble();
					double d7 = sc7.nextDouble();
					double d8 = sc8.nextDouble();
					double d9 = sc9.nextDouble();
					double dX = scX.nextDouble();
					double phi = d1;
					double ne = d2;
					double nOx = d3;
					double COx = d4*Math.pow(10, d5);
					double nRe = d6;
					double CRe = d7*Math.pow(10, d8);
					double nOH = d9;
					double COH = Math.pow(10, dX-14);
					double phi_ = phi+0.0592/ne*Math.log10(Math.pow(COx, nOx)/Math.pow(CRe, nRe)/Math.pow(COH, nOH));
					
					op3_1_3_1_1.setText(df.format(phi_));
					
					cl3_1.show(jp3_1, "3_1_3");
					cl3_2.show(jp3_2, "thx");
					
					sc1.close();
					sc2.close();
					sc3.close();
					sc4.close();
					sc5.close();
					sc6.close();
					sc7.close();
					sc8.close();
					sc9.close();
					scX.close();
				}else{
					cl3_1.show(jp3_1, "err");
				}
			}
		});
		b6_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cl1_2.show(jp1_2, "0");
				cl1_3.show(jp1_3, "");
				cl1_4.show(jp1_4, "");
				cl2.show(jp2, "");
				cl3_1.show(jp3_1, "");
				cb1.setSelectedIndex(0);
				cb2_1.setSelectedIndex(0);
				cb2_2.setSelectedIndex(0);
				cb2_3.setSelectedIndex(0);
				cb3_1_1.setSelectedIndex(0);
				cb3_1_2.setSelectedIndex(0);
				cb3_2_1.setSelectedIndex(0);
				cb3_2_2.setSelectedIndex(0);
				cb3_3_1.setSelectedIndex(0);
				f1_1_1_1_1.setText("");
				f1_1_1_2_1.setText("");
				f1_1_1_2_2.setText("");
				f1_1_2_1_1.setText("");
				f1_1_2_2_1.setText("");
				f1_1_2_2_1.setText("");
				f1_1_3_1_1.setText("");
				f1_1_3_2_1.setText("");
				f1_1_3_2_2.setText("");
				f1_1_3_3_1.setText("");
				f1_1_3_3_2.setText("");
				f1_1_4_1_1.setText("");
				f1_1_4_2_1.setText("");
				f1_1_4_2_2.setText("");
				f1_1_4_3_1.setText("");
				f1_1_4_3_2.setText("");
				f1_2_1_1_1.setText("");
				f1_2_1_1_2.setText("");
				f1_2_1_2_1.setText("");
				f1_2_1_2_2.setText("");
				f1_2_2_1_1.setText("");
				f1_2_2_1_2.setText("");
				f1_2_2_2_1.setText("");
				f1_2_2_2_2.setText("");
				f1_2_3_1_1.setText("");
				f1_2_3_1_2.setText("");
				f1_2_3_2_1.setText("");
				f1_2_3_2_2.setText("");
				f2_1_1_1_1.setText("");
				f2_1_2_1_1.setText("");
				f2_1_2_1_2.setText("");
				f2_1_2_2_1.setText("");
				f2_1_2_2_2.setText("");
				f2_2_1_1_1.setText("");
				f2_2_1_1_2.setText("");
				f2_2_2_1_1.setText("");
				f2_2_2_2_1.setText("");
				f2_2_2_2_2.setText("");
				f2_2_2_3_1.setText("");
				f2_2_2_3_2.setText("");
				f3_1_1_1_1.setText("");
				f3_1_1_2_1.setText("");
				f3_1_1_3_1.setText("");
				f3_1_1_4_1.setText("");
				f3_1_1_4_2.setText("");
				f3_1_1_5_1.setText("");
				f3_1_1_6_1.setText("");
				f3_1_1_6_2.setText("");
				f3_1_2_1_1.setText("");
				f3_1_2_2_1.setText("");
				f3_1_2_3_1.setText("");
				f3_1_2_4_1.setText("");
				f3_1_2_4_2.setText("");
				f3_1_2_5_1.setText("");
				f3_1_2_6_1.setText("");
				f3_1_2_6_2.setText("");
				f3_1_2_7_1.setText("");
				f3_1_2_8_1.setText("");
				f3_1_3_1_1.setText("");
				f3_1_3_2_1.setText("");
				f3_1_3_3_1.setText("");
				f3_1_3_4_1.setText("");
				f3_1_3_4_2.setText("");
				f3_1_3_5_1.setText("");
				f3_1_3_6_1.setText("");
				f3_1_3_6_2.setText("");
				f3_1_3_7_1.setText("");
				f3_1_3_8_1.setText("");
			}
		});
		b6_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ha.setVisible(true);
				ha.setLocation(256, 128);
			}
		});
		b6_3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jf.setVisible(false);
				System.exit(0);
			}
		});
	}
	void check(String str){
		int i = 0;
		int j = 0;
		char c[] = str.toCharArray();
		if(str.equals("")){
			bo = false ;
		}
		while(i<c.length&&bo){
			if(!(c[i] == 45 || c[i] == 46 || c[i]>47 && c[i]<58)){
				bo = false;
			}
			if(c[i] == 45 && i != 0){
				bo = false;
			}
			if(c[i] == 46){
				j++;
			}
			i++;
		}
		if(bo && (j>1 || c[i-1] == 46)){
			bo = false;	
		}
	}
	static String strE(double d){
		String str1 = Double.toString(d);
		String str[] = str1.split("E");
		Scanner sc = new Scanner(str[0]);
		double t = sc.nextDouble();
		sc.close();
		if(str.length == 1){
			if(t>=1){
				return df.format(t);
			}else{
				if(t>=0.1){
					return df.format(t*10)+"*10^-1";
				}else{
					if(t>=0.01){
						return df.format(t*100)+"*10^-2";
					}else{
						return df.format(t*1000)+"*10^-3";
					}
				}
			}
		}else{
			return df.format(t)+"*10^"+str[1];
		}
	}
}
