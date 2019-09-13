package com.shivaot.portfolio;



import com.shivaot.portfolio.UserPortfolio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping(value = "/portfolio")
public class controller {
    PortfolioRepository portfolioRepository;

    @Autowired
    public controller(PortfolioRepository portfolioRepository){
        this.portfolioRepository = portfolioRepository;
    }

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<UserPortfolio> getAll(){
        return portfolioRepository.findAll();
    }

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public List<UserPortfolio> create(@RequestBody UserPortfolio userPortfolio){
        portfolioRepository.save(userPortfolio);
        return portfolioRepository.findAll();
    }


}
