package com.jutong.live;

public interface LiveStateChangeListener {

	// �����Ƶ ��׼�����
	public void onErrorPusher(int code);

	// ��ʼ����
	public void onStartPusher();

	// ֹͣ����
	public void onStopPusher();
}
