package com.iqiyi.jy.service;

import com.iqiyi.jy.model.RedPacket;

public interface RedPacketService {
	
	/**
	 * ��ȡ���
	 * @param id �������
	 * @return �����Ϣ
	 */
	public RedPacket getRedPacket(Long id);

	/**
	 * �ۼ����
	 * @param id�������
	 * @return Ӱ������.
	 */
	public int decreaseRedPacket(Long id);
	
}