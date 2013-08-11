/**
 * 	Value.java
 * 	com.game.twins.majiang.util.entities
 * 	Function： 	面 
 *   ver     date      		author
 * 	──────────────────────────────────
 *   		 2013-1-22 		Norris
 *	Copyright (c) 2013, TNT All Rights Reserved.
 */
package com.game.twins.majiang.util.entities ;

import com.game.twins.majiang.util.enums.EType ;

/**
 *	ClassName:	Value
 *	Function: 	面
 *	@author   	Norris		Norris.sly@gmail.com
 *	@version  	
 *	@since   	Ver 1.1		I used to be a programmer like you, then I took an arrow in the knee 
 *	@Date	 	2013		2013-1-22		下午7:49:57
 *	@see 	 	
 */
public class Value {
	/**
	 * 	面值
	 * 	int			:		mValue	
	 * 	@since Ver 1.0
	 */
	private int mValue ;
	/**
	 * 	是风头
	 * 	boolean			:		isFeng	
	 * 	@since Ver 1.0
	 */
	private boolean isFeng ;
	/**
	 * 	是花
	 * 	boolean			:		isHua	
	 * 	@since Ver 1.0
	 */
	private boolean isHua ;
	/**
	 * 	属性 
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
	 * 	initFeng:(初始化风)
	 *  ──────────────────────────────────
	 * 	东南西北-1234  	    
	 * 	@return 	void   
	 * 	@throws 
	 * 	@since  	I used to be a programmer like you, then I took an arrow in the knee　Ver 1.0
	 */
	private void initFeng() {
		isFeng = true;
		isHua = false;
	}
	/**
	 * 	initHua:(初始化花)
	 *  ──────────────────────────────────
	 * 	@param  	    
	 * 	@return 	void   
	 * 	@throws 
	 * 	@since  	I used to be a programmer like you, then I took an arrow in the knee　Ver 1.0
	 */
	private void initHua() {
		isFeng = false;
		isHua = true;
	}
	
	

}
