package com.iqiyi.jy.service;

public interface RedisRedPacketService {

	/**
	 * ����redis������б�
	 * @param redPacketId --��������
	 * @param unitAmount -- ������
	 */
	public void saveUserRedPacketByRedis(Long redPacketId, Double unitAmount);
}
