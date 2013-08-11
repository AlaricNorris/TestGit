/**
 * 	Value.java
 * 	com.game.twins.majiang.util.entities
 * 	Function�� 	�� 
 *   ver     date      		author
 * 	��������������������������������������������������������������������
 *   		 2013-1-22 		Norris
 *	Copyright (c) 2013, TNT All Rights Reserved.
 */
package com.game.twins.majiang.util.entities ;

import com.game.twins.majiang.util.enums.EType ;

/**
 *	ClassName:	Value
 *	Function: 	��
 *	@author   	Norris		Norris.sly@gmail.com
 *	@version  	
 *	@since   	Ver 1.1		I used to be a programmer like you, then I took an arrow in the knee 
 *	@Date	 	2013		2013-1-22		����7:49:57
 *	@see 	 	
 */
public class Value {
	/**
	 * 	��ֵ
	 * 	int			:		mValue	
	 * 	@since Ver 1.0
	 */
	private int mValue ;
	/**
	 * 	�Ƿ�ͷ
	 * 	boolean			:		isFeng	
	 * 	@since Ver 1.0
	 */
	private boolean isFeng ;
	/**
	 * 	�ǻ�
	 * 	boolean			:		isHua	
	 * 	@since Ver 1.0
	 */
	private boolean isHua ;
	/**
	 * 	���� 
	 * 	EType			:		mBelong	
	 * 	@see com.game.twins.majiang.util.enums.EType
	 * 	@since Ver 1.0
	 */
	private EType mType ;
	public Value() {
	}
	/**
	 * 	Creates a new instance of Value.
	 * 	@param mValue
	 * 	@param mType
	 */
	public Value(int pValue , EType pType) {
		this.mType = pType ;
		switch(mType) {
			case FENG :
				initFeng();
				break ;
			case HUA :
				initHua();
				break ;
			case SHUA :
				initHua();
				break ;
			default :
				break ;
		}
		this.mValue = pValue ;
	}
	/**
	 * 	initFeng:(��ʼ����)
	 *  ��������������������������������������������������������������������
	 * 	��������-1234  	    
	 * 	@return 	void   
	 * 	@throws 
	 * 	@since  	I used to be a programmer like you, then I took an arrow in the knee��Ver 1.0
	 */
	private void initFeng() {
		isFeng = true;
		isHua = false;
	}
	/**
	 * 	initHua:(��ʼ����)
	 *  ��������������������������������������������������������������������
	 * 	@param  	    
	 * 	@return 	void   
	 * 	@throws 
	 * 	@since  	I used to be a programmer like you, then I took an arrow in the knee��Ver 1.0
	 */
	private void initHua() {
		isFeng = false;
		isHua = true;
	}
	
	

}
