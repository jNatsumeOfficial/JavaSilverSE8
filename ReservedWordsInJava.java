＊Javaの予約語＊

// 親クラス関連
interface
abstract 
implements
import
return 
default

//子クラス関連
new 
extends

//コンストラクタ(constructor)関連
this
super

//ユニーク制約関連
volatile //揮発性; 変わり易い; 移り気な;
synchronized //同期化された

//修飾子(しゅうしょくし;modifier)関連
package
private
public
protected
static
void
class
finally // 定数
const //<= final at the same page become C++; 定数

native // <=Java以外の言語で実装される; Javaで処理速度が期待できない時使用
public native int hashCode(); // 本体は省略、中身は改めてC等で実装する必要がある
<Refenrence> https://java-code.jp/120

strictfp //浮動小数点数高速処理; 演算結果に誤差が有り得る;java言語上未使用の予約語
//<=default : double, float values since CPU spec
strictfp double val;

//例外関連
goto // java言語上未使用の予約語; since C++; goto error or goto next resume
transient //用途: 例外[Class]-[Field]構築時
//1. 保存されないtransientフィールド。
private transient int notSavedData;
<Reference> http://www.kab-studio.biz/Programing/JavaA2Z/Word/00000461.html
//2. @Taget({METHOD}) 
public @interface Transient{boolean value() default ture;}

throws //例外を投げる時使用
throw //例外発生させる時使用
assert //(無証拠で)断言する; 言い張る; (権利、要求等を)強く主張する; 
// 繰り返し分関連 
//<= (DML Trigger) switch-case, if-else, for(i=値 ;条件式;i++), while-continew, do, try-catch-final
enum // 列挙型; static array() <= switch-caseの値
switch 
case 


while
continue 
break

for 
do

if
else

try
catch
final

//型指定関連
int
short
boolean
char
long
byte
float
double

//型推論関連
instanceof //変数が指すインスタンスが何のクラスか判定する演算子
