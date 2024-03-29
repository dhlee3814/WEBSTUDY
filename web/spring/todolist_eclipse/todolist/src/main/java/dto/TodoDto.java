package dto;


import utils.FormatConverter;

public class TodoDto {
	/**
	 * Status(End) 
	 * 
	 * **/
    private Long id;
    private String name;
    private String regDate;
    private int sequence;
    private String title;
    private String type;

    public TodoDto() {
    }

    public TodoDto(String name,int sequence, String title) {
        this.name = name;
        this.sequence = sequence;
        this.title = title;
    }

    public TodoDto(Long id, String name, String regDate, int sequence, String title, String type) {
        this.id = id;
        this.name = name;
        this.regDate = regDate;
        this.sequence = sequence;
        this.title = title;
        this.type = type;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegDate() {
        return FormatConverter.convertDateTime(regDate);
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TodoDto{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", regDate='").append(regDate).append('\'');
        sb.append(", sequence=").append(sequence);
        sb.append(", title='").append(title).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
