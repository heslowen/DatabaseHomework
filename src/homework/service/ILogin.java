package homework.service;

//ҵ������Ա��¼ϵͳ�ӿ��ļ�


import homework.model.Operator;

public interface ILogin {
	/*
	 * �ж��û��Ƿ����,����û�����,�򷵻��û�����:�û���,���뷵��ֵ:����ԱPO����
	 */
	public Operator isOperator(String operatorName, String operatorPwd);
}
