package omp;

public class CandidateDeleted extends AbstractEvent {

    private Long id;
    private Long elctionId;
    private Integer no;
    private String party;
    private String name;
    private Integer campaigns;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getElctionId() {
        return elctionId;
    }

    public void setElctionId(Long elctionId) {
        this.elctionId = elctionId;
    }
    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }
    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Integer getCampaigns() {
        return campaigns;
    }

    public void setCampaigns(Integer campaigns) {
        this.campaigns = campaigns;
    }
}