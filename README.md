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

Contents
코드 Edit
포커스
검색
자동완성
리팩토링
디버깅
Git
플러그인

계속해서 추가할 예정입니다!

기본 단축키
디렉터리, 패키지, 클래스 등 생성 목록 보기
MacOS: Cmd + n
Win/Linux: Alt + Insert
코드 Edit
Main method 생성 및 실행
메인 메서드 선언
live template 이용: psvm
(live template은 아래 참고)
메인 메서드 실행
좌측 실행 버튼
단축키
현재 Focus 가 해당 메서드에 있어야 함
MacOS: Ctrl + Shift + r
Win/Linux: Ctrl + Shift + F10 - 이전 실행문 재실행 (우측 상단에 실행문 목록 확인 가능)
MacOS: Ctrl + r
Win/Linux: Shift + F10
라인 수정하기
라인 복제하기
MacOS: Cmd + d
Win/Linux: Ctrl + d
라인 삭제하기
MacOS: Cmd + 백스페이스
Win/Linux: Ctrl + y
문자열 라인 합치기
MacOS: Ctrl + Shift + j
Win/Linux: Ctrl + Shift + j
라인 단위로 옮기기
1) 문법에 관계 없이 라인 이동
MacOS: Opt + Shift + ↑↓
Win/Linux: Alt + Shift + ↑↓
2) 구문 안에서만 라인 이동 (메서드를 벗어날 수 없음)
MacOS: Cmd + Shift + ↑↓
Win/Linux: Ctrl + Shift + ↑↓
Element 단위로 옮기기
Ex. html, xml 등의 규격이 정해진 마크업 언어에서 활용

MacOS: Cmd + Opt + Shift + ←→
Win/Linux: Ctrl + Alt + Shift + ←→
코드 즉시 보기
인자값 즉시 보기 (Parameter Info)
MacOS: Cmd + p
Win/Linux: Ctrl + p
코드 구현부 즉시 보기 (Quick Definition)
클래스- 클래스 전체 코드
인스턴스- 인스턴스 생성 코드
메서드- 메서드 정의 코드
MacOS: Opt + Space
Win/Linux: Ctrl + Shift + i
Doc 즉시 보기 (Quick Documentation)
MacOS: F1
Win/Linux: Ctrl + q
포커스
포커스 에디터
단어별 이동
MacOS: Opt + ←→
Win/Linux: Ctrl + ←→
단어별 선택 (Move Caret to Next Word with Selection)
MacOS: Opt + Shift + ←→
Win/Linux: Ctrl + Shift + ←→
라인 첫/끝 이동
MacOS: fn + ←→
Win/Linux: Home, End
라인 전체 선택
MacOS: fn + Shift + ←→
Win/Linux: Shift + Home, End
Page Up/Down
MacOS: fn + ↑↓
Win/Linux: Page Up, Page Down
포커스 특수키
포커스 범위 한 단계씩 늘리기 (Extend Selection)
해당 커서의 단어 포커스하기
MacOS: Opt + ↑↓
Win/Linux
위: Ctrl + w
아래: Ctrl + Shift + w
포커스 뒤로/앞으로 가기 (Navigate -> Back/Forward)
이전 커서가 있던 화면으로 돌아갈 때 유용
클래스 이동도 가능
MacOS: Cmd + [ 또는 ]
Win/Linux: Ctrl + Alt + ←→
멀티 포커스 (Clone Caret Below)
MacOS: Opt + Opt + ↓ (Opt 누른 상태)
Win/Linux: Ctrl + Ctrl + ↓ (Ctrl 누른 상태)
오류 라인으로 자동 포커스 (Navigate -> Next Highlighted Error)
MacOS: F2
Win/Linux: F2
검색
검색 텍스트
현재 파일에서 검색 (Find)
MacOS: Cmd + f
Win/Linux: Ctrl + f
현재 파일에서 교체 (Replace)
MacOS: Cmd + r
Win/Linux: Ctrl + r
전체에서 검색 (Find in Path)
MacOS: Cmd + Shift + f
Win/Linux: Ctrl + Shift + f
전체에서 교체 (Replace in Path)
MacOS: Cmd + Shift + r
Win/Linux: Ctrl + Shift + r
정규표현식으로 검색, 교체
[Find/Replace] -> Regex 체크
검색 기타
파일 검색 (Navigate -> File)
MacOS: Cmd + Shift + o
Win/Linux: Ctrl + Shift + n
메서드 검색 (Navigate -> Symbol)
MacOS: Cmd + Opt + o
Win/Linux: Ctrl + Shift + Alt + n
Action 검색 (Find Action: Enter action or option name)
MacOS: Cmd + Shift + a
Win/Linux: Ctrl + Shift + a
최근 열었던 파일 목록 보기 (Recent Files)
MacOS: Cmd + e
Win/Linux: Ctrl + e
최근 수정한 파일 목록 보기 (Recently Changed Files)
MacOS: Cmd + Shift + e
Win/Linux: Ctrl + Shift + e
자동완성
자동완성
기본 자동완성 (Completion -> Basic)
MacOS: Ctrl + Space
Win/Linux: Ctrl + Space
스마트 자동완성 (Completion -> SmartType)
MacOS: Ctrl + Shift + Space
Win/Linux: Ctrl + Shift + Space
static method 자동완성
MacOS: Ctrl + Space + Space
Win/Linux: Ctrl + Space + Space
getter/setter/생성자 자동완성 (Generate)
MacOS: Cmd + n
Win/Linux: Alt + Insert
Override 메서드 자동완성 (Implement Methods)
MacOS: Ctrl + i
Win/Linux: Ctrl + i
Live Template (Code Template)
live template 목록 확인하기 (Insert Live Template)
[Find Action] -> Live Templates 입력
MacOS: Cmd + j
Win/Linux: Ctrl + j
자주 사용하는 live template 예시
psvm: 메인메서드 선언
sout: System.out.println(); 자동 생성
나만의 live template 추가하기
[Find Action] -> Live Templates 입력
other 선택 -> “+” 버튼 -> Live Template
Abbreviation(축약어)
Ex. ent
Description(설명)
Ex. Entity Class Header
Template text(텍스트)
아래 예시
Error(No applicable contexts yet.)에서 Define 클릭
Ex. Java 선택
Apply & OK
// ORM에서의 반복적인 코드 (live template로 설정)
@Getter
@NoArgsConstructor(access = AccessLevel.PROOTECTED)
@Entity
/** Entity Class */
public class Comment {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
}
리팩토링
리팩토링 Extract
변수 추출하기 (Extract -> Variable)
MacOS: Cmd + Opt + v
Win/Linux: Ctrl + Alt + v
파라미터 추출하기 (Extract -> Parameter)
MacOS: Cmd + Opt + p
Win/Linux: Ctrl + Alt + p
메서드 추출하기 (Extract -> Method)
MacOS: Cmd + Opt + m
Win/Linux: Ctrl + Alt + m
이너클래스 추출하기
MacOS: F6
Win/Linux: F6
리팩토링 기타
이름 일괄 변경하기 (Rename)
MacOS: Shift + F6
Win/Linux: Shift + F6
타입 일괄 변경하기 (Type Migration)
MacOS: Cmd + Shift + F6
Win/Linux: Ctrl + Shift + F6
Import 정리하기 (Optimize Imports)
MacOS: Ctrl + Opt + o
Win/Linux: Ctrl + Alt + o
자동 설정: [Find Action] -> Optimize imports on 입력 -> “Auto import: …”
코드 자동 정렬하기 (Reformat Code)
MacOS: Cmd + Opt + l
Win/Linux: Ctrl + Alt + l
디버깅
디버깅
Break Point 걸기 (Toggle Line Breakpoint)
해당 라인 number 옆 클릭
MacOS: Cmd + F8
Win/Linux: Ctrl + F8
Break Point의 라인은 아직 실행하기 전 상태이다.
Conditional Break Point
반복문에서 특정값을 가지고 있는 객체가 나왔을 때만 멈추고자 할 때 유용
Break Point (빨간원) 우클릭 -> 조건 입력
Ex. “HEEE”.equals(user.name)
Debug 모드로 실행하기 - 즉시 실행 (Debug)
현재 Focus 가 해당 메서드에 있어야 함
좌측 디버그 실행 버튼
MacOS: Ctrl + Shift + d
Win/Linux: 없음 (커스텀해서 사용하거나 마우스 이용)
Debug 모드로 실행하기 - 이전 실행
이전 실행문 재실행 (우측 상단에 실행문 목록 확인 가능)
MacOS: Ctrl + d
Win/Linux: Shift + F9
Breaking 상태에서의 기능


Resume (다음 Break Point로 넘어가기)
MacOS: Opt + Cmd + r
Win/Linux: F9
참고 Debugger 탭 설명
Debugger 탭 좌측 창 - Call Stack
현재 Break Point로 넘어오기까지 실행한 메서드 목록
오픈 소스 코드를 분석할 때 유용
Debugger 탭 우측 창 - Variables
현재 Break Point에서 볼 수 있는 변수값 목록
Step Over (다음 라인으로 넘어가기)
MacOS: F8
Win/Linux: F8
Step Into (해당 라인 안(다음 메서드)으로 들어가기)
MacOS: F7
Win/Linux: F7
Step Out (현재 포커스를 밖으로 빼기)
MacOS: Shift + F8
Win/Linux: Shift + F8
Evaluate Expression (현재 Breaking 상태에서 즉시 코드 실행하기)
MacOS: Opt + F8
Win/Linux: Alt + F8
데이터가 잘 들어갔는지 확인할 때 유용
켤 때마다 초기화 - 단발성 코드를 실행할 때 유용
Watch (Breaking 이후의 코드 변경 확인하기)
MacOS: 없음
Win/Linux: 없음
다음 Break Point 전까지 확인하고 싶은 값을 계속 주시하고자할 때 유용
Git & Github
Git 기본 기본 기능 사용하기
Git View On
View 탭 -> Tool Windows -> Version Control
MacOS: Cmd + 9
Win/Linux: Alt + 9
Git Option Popup (VCS Operations Popup)
MacOS: Ctrl + v
Win/Linux: Alt + `(Back Quote)
Git History
MacOS: Ctrl + v => 4
Win/Linux: Alt + ` => 4
Branch
MacOS: Ctrl + v => 7
Win/Linux: Alt + ` => 7
Commit
MacOS: Cmd + k
Win/Linux: Ctrl + k
Push
MacOS: Cmd + Shift + k
Win/Linux: Ctrl + Shift + k
Pull
MacOS: [Find Action] => git pull 검색
Win/Linux: [Find Action] => git pull 검색
플러그인
플러그인 설치 방법
[Find Action] -> plugins 입력 -> Preferences/Settings의 Plugins 선택
Browse repositories… 클릭
Sort by: Downloads 로 설정
추천 플러그인
presentation assistant
다른 OS에서 해당 단축키가 어떤 것인지 알려준다.
발표/시연용으로 사용할 때 유용하다.
.gitignore
자동완성 기능을 제공한다.
BashSupport
실행 파일에 대한 여러 기능을 제공한다.
Cf. 실행 권한 변경 후 실행 가능
chmod +x app.sh
Material Theme UI
추천 테마
jojoldu Translation
영문 코드를 한글로, 한글을 영문으로 번역해주는 기능을 제공한다.
관련된 Post
Vim에서 유용한 단축키에 대해 알고 싶으시면 Vim 유용한 단축키 정리를 참고하시기 바랍니다.
Reference
https://www.inflearn.com/course/intellij-guide/lecture/13200
이미지 참고
https://gmlwjd9405.github.io/2019/05/21/intellij-shortkey.html



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
