pragma solidity ^0.4.4;

contract Elections {

    uint Voting = 0.001ether;

    struct Citizen{
        string name;
        string surname;
        uint age;
        uint rntrc;


    }
    Citizen [] public citizens;

    function _createCitizen(string name, string surname, uint age, uint rntrc) public internal {
        uint id = citizens.push(Citizen(_name, _surname, _age, _rntrc));
        citizenToOwner[id] = msg.sender;
              NewCitizen(id,_name, _surname, _age, _rntrc)  ;

    }
    function setVoting(uint _vote) external onlyOwner {
        Voting = _vote;
    }

    function changeName(uint _citizenId, string _newSurName) external  {
        require(msg.sender == citizenToOwner[_citizenId]);
        citizens[_citizenId].name = _newSurName;
    }

}