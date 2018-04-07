package testHibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity //hibernate가 인지하고 Product를 테이블로 만들어줌
@Table(name="Product") //테이블 ㅣㅇ름을 지정할 수 있다. 지정하지 않으면 클래스 이름과 같이한다.
public class Product {

	@Id //record의 primary key이다.
	@GeneratedValue //id를 자동생성
	@Column(name="product_id") //column이름을 지정할 수 있다.
	private int id;
	
	private String name;
	
	private int price;
	
	private String description;
}
