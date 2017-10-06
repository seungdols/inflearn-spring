# 정리

* application-context.xml과 dispatcher-servlet.xml을 WEB-INF/하위 디렉토리로 옮기면, 파일을 읽지 못함.
  * 원인은 일단, WEB-INF/dispatcher-servlet.xml 경로에 있을 것이라고 인식하는 이유인듯보임.
  
* Model은 파라미터로 받지만, ModelAndView는 직접 클래스 생성 후 리턴함.
  * ModelAndView는 생성자로도 ViewName을 지정 할 수 있음.