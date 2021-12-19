
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

/**
 *
 * @author 奔跑 QQ:361817468
 */
public class MahjongTileInitWrongNameException extends Exception
{
    private final String wrongName;
    public MahjongTileInitWrongNameException(String wrongName)
    {
        this.wrongName = wrongName;
    }

    public String getWrongName()
    {
        return wrongName;
    }

    public String[][][] standardMahjongNames()
    {
        return MahjongTile.STANDARD_MAHJONG_NAMES;
    }
}
