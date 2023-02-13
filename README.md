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

반드시 익혀야할 단축키<br/><br/>

단축키	설명<br/>
Ctrl + Shift + Space	적합한 코드 자동완성을 추천 (Smart Code Completion)<br/>
Shift + Shift	파일, 클래스, 설정 등 키워드에 관련된 가능한 모든 것을 검색 (Search Everywhere)<br/>
Alt + Enter	퀵픽스 제안 (Show intention actions and quick-fixes)<br/>
Alt + Insert	생성자, Getter/Setter, toString과 같은 코드 생성<br/>

(Lombok으로 대체 가능)<br/>

Ctrl + P	커서가 위치한 메서드의 매개변수 조회<br/>
Ctrl + W	커서 근처의 코드 선택 영역 확대<br/>
Ctrl + Shift + W	커서 근처의 코드 선택 영역 축소<br/>
Ctrl + E	최근 연 파일 목록 검색<br/>
Shift + F6	Rename<br/>
 

General (일반적인 단축키)<br/>

단축키	설명<br/>
Alt + #[0-9]	IDEA 상단 도구창 순서에 맞는 도구창 띄움<br/>
Ctrl + S	모두 저장<br/>
Ctrl + Alt + Y	IntelliJ가 파일 시스템에서 최신 변경 사항을 처리하도록 강제<br/>
일반적으로 변경 내용은 자동으로 처리되므로 작업은 아무 작업도 수행하지 않음<br/>
Ctrl + Shift + F12	편집기 영역을 최대 크기로 토글<br/>
Alt + Shift + I	현재 프로필 기준으로 현재 파일 검사<br/>
Ctrl + `	인텔리제이 테마 변경<br/>

* ` 는 javascript es6 문법에서 사용하는 ` (작은 따옴표 아님)<br/>
Ctrl + Alt + S	설정 창을 띄움<br/>
Ctrl + Alt + Shift + S	프로젝트 구조를 확인 및 변경할 수 있는 창을 띄움<br/>
Ctrl + Shift + A	액션을 검색하여 실행<br/>

* 저 같은 경우 주로 Shift + Shift를 사용<br/>
 

Debugging (디버깅 관련 단축키)<br/>

단축키	설명<br/>
F8 / F7	디버깅 한 단계씩 진행 (step into) / 디버깅 메서드 안으로 들어가면서 진행 (step out)<br/>
Shift + F7 / Shift + F8	Smart step into / Smart step out<br/>
Alt + F9	Run to cursor<br/>
Alt + F8	Evaluate expression<br/>
F9	Resume program<br/>
Ctrl + F8	Toggle breakpoint<br/>
Ctrl + Shift + F8	View breakpoints<br/>
 

Search / Replace (검색 및 대체 관련 단축키)<br/>

단축키	설명<br/>
Shift + Shift	파일, 클래스, 설정 등 키워드에 관련된 모든 것을 검색 (Search Everywhere)<br/>
Ctrl + F	파일 내 검색<br/>
F3 / Shift + F3	다음 검색 항목 / 이전 검색 항목<br/>
Ctrl + R	대체 (Replace)<br/>
Ctrl + Shift + F	Find in path<br/>
Ctrl + Shift + R	Replace in path<br/>
Alt + J	Select next occurrence<br/>
Ctrl + Alt + Shift + J	Select all occurrences<br/>
Alt + Shift + J	Unselect occurrence<br/>
 

Editing (편집기(IDE) 관련 단축키)<br/>

단축키	설명<br/>
Ctrl + Space	기본 코드 자동 완성 (Basic code completion)<br/>
Ctrl + Shift + Space	적합한 자동완성 추천 (Smart code completion)<br/>
Ctrl + Shift + Enter	문장 완성 (Complete statement)<br/>
Ctrl + P	매개변수 정보 조회 (within method call arguments)<br/>
Ctrl + Q	Quick documentation lookup<br/>
Shift + F1	External Doc<br/>
Ctrl + mouse	Brief info<br/>
Ctrl + F1	Show descriptions of error at caret<br/>
Alt + Insert	생성자, Getter/Setter, toString과 같은 코드 생성<br/>

(Lombok으로 대체 가능)<br/>

Ctrl + O	메서드 오버라이딩<br/>
Ctrl + I	메서드 구현<br/>
Ctrl + Alt + T	Surround with ...<br/>
Ctrl + /	한줄 주석 생성 / 제거<br/>
Ctrl + Shift + /	블록 주석 생성 / 제거<br/>
Ctrl + W	커서 근처의 코드 선택 영역 확대<br/>
Ctrl + Shift + W	커서 근처의 코드 선택 영역 축소<br/>
Alt + Q	Context info<br/>
Alt + Enter	퀵픽스 제안 (Show intention actions and quick-fixes)<br/>
Ctrl + Alt + L	코드 정리 (Reformat code)<br/>
Ctrl + Alt + O	import 정리 (Optimize imports)<br/>
Ctrl + Alt + I	인덴트 맞춤 (Auto-indent lines)<br/>
Tab / Shift Tab	인덴트 추가 / 제거 (Indent / unindent selected lines)<br/>
Ctrl + X,<br/>
Shift + Delete	Cut current line to clipboards<br/>
Ctrl + C,<br/>
Ctrl + Insert	Copy current line to clipboards<br/>
Ctrl + V,<br/>
Shift + Insert	Paste from clipboards<br/>
Ctrl + Shift + V	Paste from recent buffers<br/>
Ctrl + D	Duplicate current line<br/>
Ctrl + Y	Delete line at caret<br/>
Ctrl + Shift + J	Smart line join<br/>
Ctrl + Enter	Start new split<br/>
Shift + Enter	Start new line<br/>
Ctrl + Shift + U	Toggle case for word at caret or selected block<br/>
Ctrl + Shift + ]/[	Select till code block end / start<br/>
Ctrl + Delete	Delete to word end<br/>
Ctrl + Backspace	Delete to word start<br/>
Ctrl + Numpad+/-	Expand / collapse code block<br/>
Ctrl + Shift + Numpad+	Expand all<br/>
Ctrl + Shift + Numpad-	Collapse all<br/>
Ctrl + F4	Close active editor tab<br/>
 

Refactoring (소스 리팩토링 관련 단축키)<br/>

단축키	설명<br/>
F5	복사 (Copy)<br/>
F6	이동 (Move)<br/>
Alt + Delete	Safe Delete<br/>
Shift + F6	이름 변경 (Rename)<br/>
Ctrl + Alt + Shift + T	Refactor this<br/>
Ctrl + F6	Change Signature<br/>
Ctrl + Alt + N	Inline<br/>
Ctrl + Alt + M	Extract Method<br/>
Ctrl + Alt + V	Extract Variable<br/>
Ctrl + Alt + F	Extract Field<br/>
Ctrl + Alt + C	Extract Constant<br/>
Ctrl + Alt + P	Extract Parameter<br/>
 

Navigation (이동 관련 단축키)<br/>

단축키	설명<br/>
Ctrl + N	Class로 이동<br/>
Ctrl + Shift + N	파일로 이동<br/>
Ctrl + Alt + Shift + N	Go to symbol<br/>
Alt + Right / Left	에디터 탭 이동<br/>
F12	Go back to previous tool window<br/>
Esc	도구창으로부터 에디터로 이동<br/>
Shift + Esc	Hide active or last active window<br/>
Ctrl + G	라인으로 이동<br/>
Ctrl + E	최근 연 파일 목록 검색<br/>
Ctrl + Alt + Left / Right	Navigate back / forward<br/>
Ctrl + Shift + Backspace	Navigate to last edit location<br/>
Alt + F1	Select current file or symbol in any view<br/>
Ctrl + B,<br/>
Ctrl + Click	Go to declaration<br/>
Ctrl + Alt + B	Go to implementations<br/>
Ctrl + Shift + I	Open quick definition lookup<br/>
Ctrl + Shift + B	Go to type declaratoin<br/>
Ctrl + U	Go to super-method / super-class<br/>
Alt + Up / Down	Go to previous / next method<br/>
Ctrl + ] / [	Move to code block end / start<br/>
Ctrl + F12	File structure popup<br/>
Ctrl + H	Type hiearchy<br/>
Ctrl + Shift + H	Method hiearchy<br/>
F2 / Shift + F2	Call hiearchy<br/>
F4 / Ctrl + Enter	Edit source / View source<br/>
Alt + Home	Show navigation bar<br/>
F11	Toggle bookmark<br/>
Ctrl + F11	Toggle bookmark with mnemonic<br/>
Ctrl + #[0-9]	IDEA 상단 도구창 순서에 맞는 도구창 띄움<br/>
Shift + F11	Show bookmarks<br/>
 

Compile and Run (컴파일 및 실행 관련 단축키)<br/>

단축키	설명<br/>
Ctrl + F9	프로젝트 빌드<br/>
Ctrl + Shift + F9	선택한 파일, 패키지 혹은 모듈 컴파일 (Compile selected file, package or module)<br/>
Alt + Shift + F10 / F9	configuration 선택 후 실행 / 디버깅 (Select configuration and run / debug)<br/>
Shift + F10 / F9	프로젝트 실행 / 디버깅<br/>
Ctrl + Shift + F10	Run context configuratoin from editor<br/>
 

Usage Search (사용처 검색 관련 단축키)<br/>

단축키	설명<br/>
Alt + F7 / Ctrl + F7	사용처 탐색 / 파일 내 사용처 탐색 (Find usages / Find usages in file)<br/>
Ctrl + Shift + F7	파일 내 사용처 하이라이트 (Highlight usages in file)<br/>
Ctrl + Alt + F7	사용처 조회 (Show usages)<br/>
 

VCS / Local History (Git과 같은 버전 관리 시스템 관련 단축키)<br/>

단축키	설명<br/>
Ctrl + K	프로젝트 변경내역 commit (Commit project to VCS)<br/>
Ctrl + T	Update project form VCS<br/>
Ctrl + Shift + K	commit 내역 push (Push commits)<br/>
Alt + `	VCS 관련 팝업 띄우기<br/>

* ` 는 javascript es6 문법에서 사용하는 ` (작은 따옴표 아님)<br/>
 

Live Templates (인텔리제이 코드 템플릿 관련 단축키)<br/>
Intellij Live Template이란 코드 템플릿을 미리 지정해서 편하게 코드를 작성할 수 있는 기능입니다.<br/>

보다 자세한 내용은 링크를 참고해주세요.<br/>

 

단축키	설명<br/>
Ctrl + Alt + J	Surround with Live Template<br/>
Ctrl + J	Insert Live Template<br/>



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
