package omp.external;

import java.util.Date;

public class Election {

    private Long id;
    private String name;
    private Long electionId;
    private Date votingDay;
    private Integer votingPeriod;

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
    public Date getVotingDay() {
        return votingDay;
    }
    public void setVotingDay(Date votingDay) {
        this.votingDay = votingDay;
    }
    public Integer getVotingPeriod() {
        return votingPeriod;
    }
    public void setVotingPeriod(Integer votingPeriod) {
        this.votingPeriod = votingPeriod;
    }

}
