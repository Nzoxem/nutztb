package net.wendal.tb.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

@Table("tb_text_content")
public class TbContent extends BaseBean {

	private static final long serialVersionUID = -1646817170350437242L;
	@Column
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
}
