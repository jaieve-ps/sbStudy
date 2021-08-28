package com.study.hsy.model;

public class Pagination {
    private int listSize=5;
    private int rangeSize=5;
    private int page;
    private int range;
    private int listCnt;
    private int pageCnt;
    private int startPage;
    private int startList;
    private int endPage;
    private int endList;
    private boolean prev;
    private boolean next;

    public Pagination() {
    }

    private void getPageCnt(int listCnt, int listSize) {
        this.pageCnt = (int)Math.ceil((double)listCnt / (double)listSize);
    }

    public void calculateStartPageAndEndPage(int range, int rangeSize) {
        this.startPage = (range - 1) * rangeSize + 1;
        this.endPage = range * rangeSize;
        if(this.endPage >= this.pageCnt) {
            this.endPage = this.pageCnt;
            this.next = false;
        }
    }

    public void getBoardSeqOnPage (int page, int listSize) {
        this.startList = (page - 1) * listSize + 1;
        this.endList = page * listSize;
    }

    public void activatePrevBtn(int range) {
        this.prev = range != 1;
    }

    public void activateNextBtn(int endPage, int pageCnt) {
        this.next = endPage < pageCnt;
    }
}
