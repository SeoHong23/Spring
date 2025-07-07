package com.tenco.mustache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 메인 애플리케이션 클래스
 *
 * - @SpringBootApplication: 스프링 부트 자동 설정 활성화
 * - 컴포넌트 스캔의 시작점
 * - 내장 톰캣 서버 실행
 */

@SpringBootApplication
public class MustacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(MustacheApplication.class, args);
	}

}
