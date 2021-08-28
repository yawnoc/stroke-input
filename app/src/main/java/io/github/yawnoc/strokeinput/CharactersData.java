/*
  Copyright 2021 Conway
  Licensed under the GNU General Public License v3.0 (GPL-3.0-only).
  This is free software with NO WARRANTY etc. etc.,
  see LICENSE or <https://www.gnu.org/licenses/>.
*/

package io.github.yawnoc.strokeinput;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import io.github.yawnoc.utilities.Stringy;

/*
  A tuple that holds sets of goodly and abominable characters.
*/
public class CharactersData {
  
  private Set<String> goodlySet;
  private Set<String> abominableSet;
  
  CharactersData(final String commaSeparatedCharacters) {
    
    final String[] splitCharactersList = commaSeparatedCharacters.split(",");
    final String goodlyCharacters = splitCharactersList[0];
    final String abominableCharacters = (
      splitCharactersList.length > 1
        ? splitCharactersList[1]
        : ""
    );
    
    goodlySet = new HashSet<>();
    abominableSet = new HashSet<>();
    
    goodlySet.addAll(Stringy.toCharacterList(goodlyCharacters));
    abominableSet.addAll(Stringy.toCharacterList(abominableCharacters));
  }
  
  public List<String> toCandidateList() {
    return toCandidateList(Integer.MAX_VALUE);
  }
  
  public List<String> toCandidateList(final int maxCandidateCount) {
    
    final List<String> goodlyList = new ArrayList<>(goodlySet);
    final List<String> abominableList = new ArrayList<>(abominableSet);
    // TODO: implement sorting
    
    final List<String> candidateList = new ArrayList<>();
    candidateList.addAll(goodlyList);
    candidateList.addAll(abominableList);
    
    return new ArrayList<>(candidateList.subList(0, maxCandidateCount));
  }
  
}
