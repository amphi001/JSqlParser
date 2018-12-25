package net.sf.jsqlparser;


import net.sf.jsqlparser.parser.CCJSqlParserUtil;

public class Test {
    public static void main(String args[]){
        String sql="select validate from video WHERE id=8002";
        try {
            CCJSqlParserUtil.parse(sql);
        } catch (JSQLParserException e) {
            e.printStackTrace();
        }
    }
}
