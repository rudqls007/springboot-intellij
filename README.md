# springboot-intellij
스프링부트 개발환경 ( https://start.spring.io/ )

 - **1.8.0_332-1** (LTS, supported until [May 2026](https://access.redhat.com/articles/1299013#OpenJDK_Lifecycle_Dates_and_Windows_versions), [announcement](https://groups.google.com/g/ojdkbuild/c/WrJpQ6pactI/m/cQKjJ67RAQAJ))
   - [java-1.8.0-openjdk-1.8.0.332-1.b09.ojdkbuild.windows.x86_64.zip](https://github.com/ojdkbuild/ojdkbuild/releases/download/java-1.8.0-openjdk-1.8.0.332-1.b09/java-1.8.0-openjdk-1.8.0.332-1.b09.ojdkbuild.windows.x86_64.zip) ([sha256](https://github.com/ojdkbuild/ojdkbuild/blob/master/resources/checksums/java-1.8.0-openjdk-1.8.0.332-1.b09.ojdkbuild.windows.x86_64.zip.sha256))
   - [java-1.8.0-openjdk-1.8.0.332-1.b09.ojdkbuild.windows.x86_64.msi](https://github.com/ojdkbuild/ojdkbuild/releases/download/java-1.8.0-openjdk-1.8.0.332-1.b09/java-1.8.0-openjdk-1.8.0.332-1.b09.ojdkbuild.windows.x86_64.msi) ([sha256](https://github.com/ojdkbuild/ojdkbuild/blob/master/resources/checksums/java-1.8.0-openjdk-1.8.0.332-1.b09.ojdkbuild.windows.x86_64.msi.sha256))
   
 - **11.0.15.9-1** (LTS, supported until [October 2024](https://access.redhat.com/articles/1299013#OpenJDK_Lifecycle_Dates_and_Windows_versions), [announcement](https://groups.google.com/g/ojdkbuild/c/auVRKFxaCqM/m/GRDiUmXRAQAJ))
   - [java-11-openjdk-11.0.15.9-1.windows.ojdkbuild.x86_64.zip](https://github.com/ojdkbuild/ojdkbuild/releases/download/java-11-openjdk-11.0.15.9-1/java-11-openjdk-11.0.15.9-1.windows.ojdkbuild.x86_64.zip) ([sha256](https://github.com/ojdkbuild/ojdkbuild/blob/master/resources/checksums/java-11-openjdk-11.0.15.9-1.windows.ojdkbuild.x86_64.zip.sha256))
   - [java-11-openjdk-11.0.15.9-1.windows.ojdkbuild.x86_64.msi](https://github.com/ojdkbuild/ojdkbuild/releases/download/java-11-openjdk-11.0.15.9-1/java-11-openjdk-11.0.15.9-1.windows.ojdkbuild.x86_64.msi) ([sha256](https://github.com/ojdkbuild/ojdkbuild/blob/master/resources/checksums/java-11-openjdk-11.0.15.9-1.windows.ojdkbuild.x86_64.msi.sha256))
 
 - **17.0.3.0.6-1** (LTS, [announcement](https://groups.google.com/g/ojdkbuild/c/CDmf-Zouyhk/m/ATtN3FDRAQAJ))
   - [java-17-openjdk-17.0.3.0.6-1.win.x86_64.zip](https://github.com/ojdkbuild/ojdkbuild/releases/download/java-17-openjdk-17.0.3.0.6-1/java-17-openjdk-17.0.3.0.6-1.win.x86_64.zip) ([sha256](https://github.com/ojdkbuild/ojdkbuild/blob/master/resources/checksums/java-17-openjdk-17.0.3.0.6-1.win.x86_64.zip.sha256))
   - [java-17-openjdk-17.0.3.0.6-1.win.x86_64.msi](https://github.com/ojdkbuild/ojdkbuild/releases/download/java-17-openjdk-17.0.3.0.6-1/java-17-openjdk-17.0.3.0.6-1.win.x86_64.msi) ([sha256](https://github.com/ojdkbuild/ojdkbuild/blob/master/resources/checksums/java-17-openjdk-17.0.3.0.6-1.win.x86_64.msi.sha256))

_Note: obsolete downloads are available at the bottom of this page_


IntelliJ plugin

▶ Grep Console
 - https://plugins.jetbrains.com/plugin/7125-grep-console/
 - Grep, tail, filter, highlight... everything you need for a console. Also can highlight the editor - nice for analyzing logs...

 - 잘만 사용 하면 콘솔 로그 가독성을 더 좋게 할 수 있다.
 - 콘솔 창 텍스트 컬러 지정, 필터, 로그 레벨 별 색 지정 등의 기능을 사용할 수 있다.

▶ Key Promoter X
 - https://plugins.jetbrains.com/plugin/9792-key-promoter-x/
 - 마우스로 버튼을 눌렀을 때, 해당하는 키보드 단축키를 알려준다.
 - 즉, 인텔리제이의 모든 동작들의 단축키를 실시간으로 보여주며, 단축키를 빠르고 쉽게 배울 수 있다.

▶ Presentation Assistant
 - Key Promoter X에서 보여지는 단축키를 시각적으로 보기 좋게 보여주는 플러그인 이다.

▶ Lombok
 - https://plugins.jetbrains.com/plugin/6317-lombok/
 - 자바에서 보일러플레이트 코드(getter, setter, toString … )들을 불필요하게 반복적으로 만드는 일을 어노테이션을 통해 줄여 주는 라이브러리.
 - 개인적으로 Lombok을 모르시는 분들이 많아서 꼭 많은분들이 알고 유용하게 사용하면 좋을 것 같다.
 - 롬복이란? : https://goddaehee.tistory.com/95

 - 설치 후 추가설정 필요. 
   File → Settings → Build, Execution, Deployment → Compliler →     Annotation Processors → Enable annotation processing 체크 → 확인

▶ Rainbow Brackets
 - https://plugins.jetbrains.com/plugin/10080-rainbow-brackets/
 - 항상 헷갈리기 쉬운 괄호 기호에 색을 부여해서 가독성을 높여준다.

▶ .ignore 플러그인
 - https://plugins.jetbrains.com/plugin/7495--ignore/
 - git이나 Docker등을 이용할때 커밋을 할때 제외되는 파일을 설정할 수 있는 플러그인 이다.
   프로젝트에서 파일을 생성할 수 있으며 txt파일 형태로 제외하려는 파일명을 등록해두면 제외되는 플러그인 이다.
   개인 eclipse 설정 파일등, IDE 고유의 폴더등을 제외할때 아주 유용하다.
   (실수로 커밋, 푸시할 일도 줄어드니 매우 유용하다.)
   
   ▶ CodeGlance
 - https://plugins.jetbrains.com/plugin/7275-codeglance/
 - Sublime 처럼 코드 미니맵(코드 보기 및 스크롤 기능)을 제공해 준다.

▶ Request Mapper
 - https://plugins.jetbrains.com/plugin/9567-request-mapper/
 - Spring MVC 기반 프로젝트에서 엔드포인트 URL 기반의 검색 및 바로가기 기능을 제공한다.

 - 단축키는 SHIFT + CTRL + \이다.

▶ iBATIS/MyBatis plugin
 - https://plugins.jetbrains.com/plugin/6725-ibatis-mybatis-mini-plugin
 - iBATIS/MyBatis 사용자를 위한 간단한 플러그인

iBATIS: Supports multiple sqlMap configurations per module. In fact it does not even bother with configurations (yet), only sqlMap files matter.
iBATIS: "Go to Declaration" for literal expressions, e.g. inside spring's SqlMapClientOperations#queryForObject parameters etc.
iBATIS: "Find Usages" for sqlMap statements
iBATIS: Copy Reference (Ctrl+Alt+Shift+C) copies qualified statement name to clipboard
iBATIS: Statement id completion inside any literal expressions
iBATIS: Some basic sqlMap file navigation
iBATIS: Quick Documentation (Ctrl+Q) on statement id in java code shows statement sql
iBATIS: Concatenated literals supported as statement references
MyBatis: Proxy interfaces support, "Go to Implementaion" jumps right into mapper xml
MyBatis: Proxy interface methods inspection, methods that have no mapper implementation marked as error
MyBatis: Some basic mapper file navigation
 - Ctrl + T : 해당 메서드의 mapper.xml 로 바로 이동 (xml에서 Ctrl + q : mapper.java로 이동)

▶ GitToolBox
 - https://plugins.jetbrains.com/plugin/7499-gittoolbox
 - git 과련 지원을 해주며, Line별 Blame을 확인할 때 유용 하다.

▶ Progress Bar
 - 빌드, 컴파일Progress바 모양을 이쁘게 바꿀 수 있다.
