package com.kodilla.patterns2.adapter.bookclasifier;


import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.toMap;

@Component
public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<com.kodilla.patterns2.adapter.bookclasifier.librarya.Book> bookSet) {
        if (bookSet.size() == 0) return 0;
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> bookMap = bookSet
                .stream()
                .collect(toMap(
                        b -> new BookSignature(b.getSignature()),
                        b -> new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(
                                b.getAuthor(),
                                b.getTitle(),
                                b.getPublicationYear()
                        )
                ));
        return medianPublicationYear(bookMap);
    }
}
