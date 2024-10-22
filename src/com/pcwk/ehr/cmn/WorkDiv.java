package com.pcwk.ehr.cmn;

import java.util.List;

public interface WorkDiv<T> {

	int writeFile(String path); // 파일 쓰기
	int readFile(String path); // 파일 읽기
	int doSave(T param); // 계정 등록
	int doUpdate(T param); // 계정 수정
	int doDelete(T param);
	T doSelectOne(T param);
	List<T> doRetrieve(DTO param);
	
}
