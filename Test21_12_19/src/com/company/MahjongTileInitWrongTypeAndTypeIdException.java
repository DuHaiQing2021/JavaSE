package com.company;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 奔跑 QQ:361817468
 */
public class MahjongTileInitWrongTypeAndTypeIdException extends Exception
{
    private final int type;
    private final int typeId;
    private final boolean isTypeWrong;

    public MahjongTileInitWrongTypeAndTypeIdException(int type,int typeId,boolean isTypeWrong)
    {
        this.type = type;
        this.typeId = typeId;
        this.isTypeWrong = isTypeWrong;
    }

    public int type()
    {
        return type;
    }

    public int typeId()
    {
        return typeId;
    }

    public boolean isTypeWrong()
    {
        return isTypeWrong;
    }
}
