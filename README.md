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

IntelliJ hotkey

반드시 익혀야할 단축키

단축키	설명
Ctrl + Shift + Space	적합한 코드 자동완성을 추천 (Smart Code Completion)
Shift + Shift	파일, 클래스, 설정 등 키워드에 관련된 가능한 모든 것을 검색 (Search Everywhere)
Alt + Enter	퀵픽스 제안 (Show intention actions and quick-fixes)
Alt + Insert	생성자, Getter/Setter, toString과 같은 코드 생성

(Lombok으로 대체 가능)

Ctrl + P	커서가 위치한 메서드의 매개변수 조회
Ctrl + W	커서 근처의 코드 선택 영역 확대
Ctrl + Shift + W	커서 근처의 코드 선택 영역 축소
Ctrl + E	최근 연 파일 목록 검색
Shift + F6	Rename
 

General (일반적인 단축키)

단축키	설명
Alt + #[0-9]	IDEA 상단 도구창 순서에 맞는 도구창 띄움
Ctrl + S	모두 저장
Ctrl + Alt + Y	IntelliJ가 파일 시스템에서 최신 변경 사항을 처리하도록 강제
일반적으로 변경 내용은 자동으로 처리되므로 작업은 아무 작업도 수행하지 않음
Ctrl + Shift + F12	편집기 영역을 최대 크기로 토글
Alt + Shift + I	현재 프로필 기준으로 현재 파일 검사
Ctrl + `	인텔리제이 테마 변경

* ` 는 javascript es6 문법에서 사용하는 ` (작은 따옴표 아님)
Ctrl + Alt + S	설정 창을 띄움
Ctrl + Alt + Shift + S	프로젝트 구조를 확인 및 변경할 수 있는 창을 띄움
Ctrl + Shift + A	액션을 검색하여 실행

* 저 같은 경우 주로 Shift + Shift를 사용
 

Debugging (디버깅 관련 단축키)

단축키	설명
F8 / F7	디버깅 한 단계씩 진행 (step into) / 디버깅 메서드 안으로 들어가면서 진행 (step out)
Shift + F7 / Shift + F8	Smart step into / Smart step out
Alt + F9	Run to cursor
Alt + F8	Evaluate expression
F9	Resume program
Ctrl + F8	Toggle breakpoint
Ctrl + Shift + F8	View breakpoints
 

Search / Replace (검색 및 대체 관련 단축키)

단축키	설명
Shift + Shift	파일, 클래스, 설정 등 키워드에 관련된 모든 것을 검색 (Search Everywhere)
Ctrl + F	파일 내 검색
F3 / Shift + F3	다음 검색 항목 / 이전 검색 항목
Ctrl + R	대체 (Replace)
Ctrl + Shift + F	Find in path
Ctrl + Shift + R	Replace in path
Alt + J	Select next occurrence
Ctrl + Alt + Shift + J	Select all occurrences
Alt + Shift + J	Unselect occurrence
 

Editing (편집기(IDE) 관련 단축키)

단축키	설명
Ctrl + Space	기본 코드 자동 완성 (Basic code completion)
Ctrl + Shift + Space	적합한 자동완성 추천 (Smart code completion)
Ctrl + Shift + Enter	문장 완성 (Complete statement)
Ctrl + P	매개변수 정보 조회 (within method call arguments)
Ctrl + Q	Quick documentation lookup
Shift + F1	External Doc
Ctrl + mouse	Brief info
Ctrl + F1	Show descriptions of error at caret
Alt + Insert	생성자, Getter/Setter, toString과 같은 코드 생성

(Lombok으로 대체 가능)

Ctrl + O	메서드 오버라이딩
Ctrl + I	메서드 구현
Ctrl + Alt + T	Surround with ...
Ctrl + /	한줄 주석 생성 / 제거
Ctrl + Shift + /	블록 주석 생성 / 제거
Ctrl + W	커서 근처의 코드 선택 영역 확대
Ctrl + Shift + W	커서 근처의 코드 선택 영역 축소
Alt + Q	Context info
Alt + Enter	퀵픽스 제안 (Show intention actions and quick-fixes)
Ctrl + Alt + L	코드 정리 (Reformat code)
Ctrl + Alt + O	import 정리 (Optimize imports)
Ctrl + Alt + I	인덴트 맞춤 (Auto-indent lines)
Tab / Shift Tab	인덴트 추가 / 제거 (Indent / unindent selected lines)
Ctrl + X,
Shift + Delete	Cut current line to clipboards
Ctrl + C,
Ctrl + Insert	Copy current line to clipboards
Ctrl + V,
Shift + Insert	Paste from clipboards
Ctrl + Shift + V	Paste from recent buffers
Ctrl + D	Duplicate current line
Ctrl + Y	Delete line at caret
Ctrl + Shift + J	Smart line join
Ctrl + Enter	Start new split
Shift + Enter	Start new line
Ctrl + Shift + U	Toggle case for word at caret or selected block
Ctrl + Shift + ]/[	Select till code block end / start
Ctrl + Delete	Delete to word end
Ctrl + Backspace	Delete to word start
Ctrl + Numpad+/-	Expand / collapse code block
Ctrl + Shift + Numpad+	Expand all
Ctrl + Shift + Numpad-	Collapse all
Ctrl + F4	Close active editor tab
 

Refactoring (소스 리팩토링 관련 단축키)

단축키	설명
F5	복사 (Copy)
F6	이동 (Move)
Alt + Delete	Safe Delete
Shift + F6	이름 변경 (Rename)
Ctrl + Alt + Shift + T	Refactor this
Ctrl + F6	Change Signature
Ctrl + Alt + N	Inline
Ctrl + Alt + M	Extract Method
Ctrl + Alt + V	Extract Variable
Ctrl + Alt + F	Extract Field
Ctrl + Alt + C	Extract Constant
Ctrl + Alt + P	Extract Parameter
 

Navigation (이동 관련 단축키)

단축키	설명
Ctrl + N	Class로 이동
Ctrl + Shift + N	파일로 이동
Ctrl + Alt + Shift + N	Go to symbol
Alt + Right / Left	에디터 탭 이동
F12	Go back to previous tool window
Esc	도구창으로부터 에디터로 이동
Shift + Esc	Hide active or last active window
Ctrl + G	라인으로 이동
Ctrl + E	최근 연 파일 목록 검색
Ctrl + Alt + Left / Right	Navigate back / forward
Ctrl + Shift + Backspace	Navigate to last edit location
Alt + F1	Select current file or symbol in any view
Ctrl + B,
Ctrl + Click	Go to declaration
Ctrl + Alt + B	Go to implementations
Ctrl + Shift + I	Open quick definition lookup
Ctrl + Shift + B	Go to type declaratoin
Ctrl + U	Go to super-method / super-class
Alt + Up / Down	Go to previous / next method
Ctrl + ] / [	Move to code block end / start
Ctrl + F12	File structure popup
Ctrl + H	Type hiearchy
Ctrl + Shift + H	Method hiearchy
F2 / Shift + F2	Call hiearchy
F4 / Ctrl + Enter	Edit source / View source
Alt + Home	Show navigation bar
F11	Toggle bookmark
Ctrl + F11	Toggle bookmark with mnemonic
Ctrl + #[0-9]	IDEA 상단 도구창 순서에 맞는 도구창 띄움
Shift + F11	Show bookmarks
 

Compile and Run (컴파일 및 실행 관련 단축키)

단축키	설명
Ctrl + F9	프로젝트 빌드
Ctrl + Shift + F9	선택한 파일, 패키지 혹은 모듈 컴파일 (Compile selected file, package or module)
Alt + Shift + F10 / F9	configuration 선택 후 실행 / 디버깅 (Select configuration and run / debug)
Shift + F10 / F9	프로젝트 실행 / 디버깅
Ctrl + Shift + F10	Run context configuratoin from editor
 

Usage Search (사용처 검색 관련 단축키)

단축키	설명
Alt + F7 / Ctrl + F7	사용처 탐색 / 파일 내 사용처 탐색 (Find usages / Find usages in file)
Ctrl + Shift + F7	파일 내 사용처 하이라이트 (Highlight usages in file)
Ctrl + Alt + F7	사용처 조회 (Show usages)
 

VCS / Local History (Git과 같은 버전 관리 시스템 관련 단축키)

단축키	설명
Ctrl + K	프로젝트 변경내역 commit (Commit project to VCS)
Ctrl + T	Update project form VCS
Ctrl + Shift + K	commit 내역 push (Push commits)
Alt + `	VCS 관련 팝업 띄우기

* ` 는 javascript es6 문법에서 사용하는 ` (작은 따옴표 아님)
 

Live Templates (인텔리제이 코드 템플릿 관련 단축키)
Intellij Live Template이란 코드 템플릿을 미리 지정해서 편하게 코드를 작성할 수 있는 기능입니다.

보다 자세한 내용은 링크를 참고해주세요.

 

단축키	설명
Ctrl + Alt + J	Surround with Live Template
Ctrl + J	Insert Live Template



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
