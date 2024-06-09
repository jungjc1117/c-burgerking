# 버거킹 키오스크 프로젝트

## 주제
이 프로젝트는 버거킹 키오스크를 모방한 주문 시스템입니다. 각 기능별로 나눠져 있으며, 개별 파일과 클래스가 주요 역할을 수행합니다.

## 작업인원 및 작업기간
- 작업인원: 강현욱, 박준재, 정은희, 조정진, 정종철
- 작업기간: 2024년 2월 13일부터 2024년 3월 14일까지

## 사용 프로그램
- C# WINFORM
- HeidiSQL
- MySQL
- Docker
- GitHub
- SourceTree

## 본인(정종철)의 역할
- 재고관리 기능을 담당했습니다.

## 배운 점
- 주문관리를 맡은 조원과의 협업을 경험하며 효과적인 협업 방법을 배웠습니다.

## 사전 요구사항
- .NET Framework
- MySQL

## 파일 및 클래스 설명

### `sale_payment.cs`
- 판매 결제에 관련된 기능을 담당하는 Windows Form입니다.
- `MySql.Data.MySqlClient` 네임스페이스를 사용하여 MySQL 데이터베이스와 상호작용합니다.

### `Form2.cs`, `Burger.cs`, `Drink.cs`, `Side.cs`
- 각각의 클래스는 해당하는 메뉴를 관리합니다.
- 버튼 클릭 등의 이벤트에 따라 메인 폼에서 필요한 메서드를 호출하여 상품을 불러오는 역할을 합니다.

### `Main_form.cs`
- 주문 폼을 담당합니다. 버거킹의 주문 시스템을 모방합니다.
- 다양한 메서드를 포함하여 주문 메뉴, 사이드 메뉴, 드링크 메뉴를 관리하고 상품을 표시합니다.

### `sale_payment.cs`
- 판매 결제 정보를 관리하는 클래스입니다.
- 판매된 상품의 결제 정보를 조회하고 관리합니다. 현금과 카드로 결제된 총액을 계산하여 표시합니다.

## 메서드 설명

### `Add_Form_To_Panel(Form form)`
- 주어진 폼을 패널에 추가하고 화면에 표시합니다.

### `Btn_Main_Menu_Click(object sender, EventArgs e)`, `Btn_Side_Menu_Click(object sender, EventArgs e)`, `Btn_Drink_Menu_Click(object sender, EventArgs e)`
- 각각의 메서드는 메인 메뉴, 사이드 메뉴, 드링크 메뉴 버튼을 클릭했을 때 해당하는 폼을 불러옵니다.

### `Load_Products_calum(int menu_id)`
- 선택한 메뉴의 정보를 데이터베이스에서 불러와서 리스트뷰에 표시합니다.

### `Delete_Selected_Menu()`
- 선택한 메뉴를 리스트뷰에서 삭제합니다.

### `Update_Total_Price()`
- 현재 리스트뷰에 있는 모든 메뉴의 총 가격을 계산하고 표시합니다.

### `listSelect()`, `Today_Payment_Click`, `monthCalendar1_DateSelected`, `button1_Click`, `재고관리`, `sale_payment_Load`
- 각각의 메서드는 판매 결제 정보를 관리하는데 필요한 기능을 수행합니다.

## 기타
- `sale_payment_Load` 메서드는 폼이 로드될 때 실행되며, 현재는 아무런 동작을 하지 않습니다. 필요한 로직을 추가할 수 있습니다.
