package homework.service.impl;

//ʵ��ҵ������Ա��¼ϵͳ�ӿ�


import homework.dao.ILoginDAO;
import homework.model.Operator;
import homework.service.ILogin;

public class LoginImp implements ILogin {
	// ���ݷ��ʲ����Ա��¼����,��springע��(�й�)
	private ILoginDAO login;

	// �ж��û��Ƿ����,����û�����,�򷵻��û�
	public Operator isOperator(String operatorName, String operatorPwd) {
		return login.isOperator(operatorName, operatorPwd);
	}

	// get/set������springע��ʱʹ��
	public ILoginDAO getLogin() {
		return login;
	}

	public void setLogin(ILoginDAO login) {
		this.login = login;
	}
}
