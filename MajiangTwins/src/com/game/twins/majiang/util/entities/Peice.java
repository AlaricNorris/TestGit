/**
 * 	Peice.java
 * 	com.game.twins.majiang.util.entities
 * 	Function： 	牌
 *   ver     date      		author
 * 	──────────────────────────────────
 *   		 2013-1-4 		Norris
 * Copyright (c) 2013, TNT All Rights Reserved.
 */
package com.game.twins.majiang.util.entities ;

/**
 * ClassName:	Peice
 * Function: 	牌
 * @author   	Norris		Norris.sly@gmail.com
 * @version  	
 * @since   	Ver 1.1		I used to be a programmer like you, then I took an arrow in the knee 
 * @Date	 	2013		2013-1-4		下午10:26:45
 * @see 	 	
 */
public class Peice {
	/**
	 * 	是4个
	 * 	boolean			:		isQuadrupled	
	 * 	@since Ver 1.0
	 */
	private boolean isQuadrupled ;
	/**
	 * 	牌的ID	1-144
	 * 	int			:		mID	
	 * 	@since Ver 1.0
	 */
	private int mID ;
	/**
	 * 	横纵坐标
	 * 	int			:		mIndex_X	
	 * 	int			:		mIndex_Y	
	 * 	@since Ver 1.0
	 */
	private int mIndex_X ,mIndex_Y;
	/**
	 * 	面值
	 * 	Value			:		mValue	
	 * 	@since Ver 1.0
	 */
	private Value mValue;
}
